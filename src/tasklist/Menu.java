package tasklist;

import java.text.*;
import java.util.*;
import task.*;
import user.*;

public class Menu {
    private final UserManager userManager;
    private Scanner scanner;
    private Account currentAccount;
    
    public Menu(){
        userManager = new UserManager();
        scanner = new Scanner(System.in);
    }
    
    public void start(){
        while (true){
            System.out.println("========== MENU UTAMA ==========");
            System.out.println("1. Login\n2. Register\n3. Keluar");
            int choice = -1;
            while (true){
                System.out.print("Pilih opsi: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Input tidak valid! harap masukkan angka.");
                }
            }
            switch (choice){
                case 1:
                    loginMenu();
                    break;
                case 2:
                    registerMenu();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini :)");
                    return;
                default:
                    System.out.println("Opsi tidak valid, silahkan coba lagi.");
            }
        }
    }
    
    private void loginMenu(){
        System.out.println("========== LOGIN ==========");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (userManager.login(username, password)){
            try {
                currentAccount = new Account(username, password, userManager);
                System.out.println("Login Berhasil. Selamat datang " + currentAccount.getUsername());
                taskMenu(username);
            } catch (IllegalArgumentException e){
                System.err.println("Login gagal: " + e.getMessage());
            }
        } else {
            System.out.println("Login gagal! Username atau Password salah.");
        }
    }
    
    private void registerMenu(){
        System.out.println("========== REGISTER ==========");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (userManager.register(username, password)){
            start();
        }
    }
    
    private void taskMenu(String username){
        TaskManager taskManager = new TaskManager(username);
        
        while (true){
            System.out.println("\n========== MENU TUGAS ==========");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Ubah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Tampilkan Tugas");
            System.out.println("5. Ubah Password");
            System.out.println("6. Hapus Akun");
            System.out.println("7. Logout");        
            int choice = -1;
            while (true){
                System.out.print("Pilih opsi: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Input tidak valid! harap masukkan angka.");
                }
            }
            switch (choice){
                case 1:
                    addTask(taskManager);
                    break;
                case 2:
                    editTask(taskManager);
                    break;
                case 3:
                    deleteTask(taskManager);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    changePassword();
                    break;
                case 6:
                    if (deleteAccount()) return;
                    break;
                case 7:
                    System.out.println("Logout..");
                    currentAccount = null;
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silahkan coba lagi.");
            }
        }
    }
    
    private void addTask(TaskManager taskManager){
        System.out.println("\n========== Tambah Tugas ==========");
        System.out.print("Nama Tugas: ");
        String taskName = scanner.nextLine();
        System.out.print("Deskripsi: ");
        String description = scanner.nextLine();
        System.out.print("Tenggat Waktu (dd-MM-yyyy): ");
        String dueDate = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        String taskType = "";
        boolean validTaskType = false;
        while (!validTaskType) {
            System.out.print("Jenis Tugas (Personal/Work): ");
            taskType = scanner.nextLine();
            if (taskType.equalsIgnoreCase("Personal") || taskType.equalsIgnoreCase("Work")) {
                validTaskType = true;
            } else {
                System.out.println("Error: Jenis tugas hanya bisa 'Personal' atau 'Work'. Silakan coba lagi.");
            }
        }
        try {
            Date due = sdf.parse(dueDate);
            Date today = new Date();
            if (due.before(today)){
                System.out.println("Error: Tenggat waktu tidak boleh kemarin.");
                return;
            }
            sdf.parse(dueDate);
            taskManager.addTask(taskName, description, dueDate, taskType);
        } catch (Exception e){
            System.out.println("Tanggal tidak Valid! Format harus dd-MM-yyyy.");
        }
    }
    
    private void editTask(TaskManager taskManager){
        System.out.println("\n========== Edit Tugas ==========");
        taskManager.displayTasks();
        if (taskManager.getTasks().isEmpty()){
            System.out.println("Tidak ada tugas yang bisa diubah.");
            return;
        }
        int taskID = -1;
        while (true){
            System.out.print("Masukkan ID tugas yang ingin diubah: ");
            try {
                taskID = Integer.parseInt(scanner.nextLine()) - 1;
                break;
            } catch (NumberFormatException e){
                System.out.println("Input tidak valid! harap masukkan angka.");
            }
        }
        if (taskID >= 0 && taskID < taskManager.getTasks().size()){
            System.out.print("Nama tugas baru: ");
            String newTaskName = scanner.nextLine();
            System.out.print("Deskripsi baru: ");
            String newDescription = scanner.nextLine();
            System.out.print("Tenggat waktu baru (dd-MM-yyyy): ");
            String newDueDate = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            System.out.println(taskID);
            try {
                Date due = sdf.parse(newDueDate);
                Date today = new Date();
                if (due.before(today)){
                    System.out.println("Error: Tenggat waktu tidak boleh kemarin.");
                    return;
                }
                sdf.parse(newDueDate);
                taskManager.editTask(taskID, newTaskName, newDescription, newDueDate);
            } catch (Exception e){
                System.out.println("Tanggal tidak valid! Format harus dd-MM-yyyy");
            }
        } else {
            System.out.println("ID tugas tidak valid!");
        }
    }
    
    private void deleteTask(TaskManager taskManager){
        System.out.println("\n========== Hapus Tugas ==========");
        taskManager.displayTasks();
        if (taskManager.getTasks().isEmpty()){
            System.out.println("Tidak ada tugas yang bisa dihapus.");
            return;
        }
        int taskID = -1;
        while (true){
            System.out.print("Masukkan ID tugas yang ingin dihapus: ");
            try {
                taskID = Integer.parseInt(scanner.nextLine()) - 1;
                if (taskID >= 0 && taskID < taskManager.getTasks().size()){
                    break;
                } else {
                    System.out.println("ID tugas tidak valid! Masukkan ID yang sesuai.");
                }
            } catch (NumberFormatException e){
                System.out.println("Input tidak valid! harap masukkan angka.");
            }
        }
        if (taskID >= 0 && taskID < taskManager.getTasks().size()){
            taskManager.deleteTask(taskID);
            System.out.println("Tugas berhasil dihapus.");
        } else {
            System.out.println("ID tugas tidak valid!");
        }
    }
    
    private void changePassword(){
        System.out.println("\n========== Ubah Password ==========");
        System.out.print("Masukkan password lama: ");
        String oldPassword = scanner.nextLine();
        System.out.print("Masukkan password baru: ");
        String newPassword = scanner.nextLine();
        System.out.print("Ulangin password baru: ");
        String repPassword = scanner.nextLine();
        if (newPassword.equals(repPassword)){
            try {
                currentAccount.setPassword(oldPassword, newPassword, userManager);
            } catch (IllegalArgumentException e){
                System.out.println("Gagal mengubah password: " + e.getMessage());
            }
        } else {
            System.out.println("Password baru dan repeat Password berbeda!");
        }
    }
    
    private boolean deleteAccount(){
        System.out.println("\n========== Delete Account ==========");
        System.out.print("Apakah kamu yakin ingin menghapus akun " + currentAccount.getUsername() + " ini? (y/n): ");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y") || confirmation.equalsIgnoreCase("yes")){
            try {
                userManager.deleteAccount(currentAccount.getUsername(), currentAccount.getPassword());
                System.out.println("Semoga kita bertemu lagi T_T");
                currentAccount = null;
                return true;
            } catch (IllegalArgumentException e){
                System.out.println("Gagal menghapus akun: " + e.getMessage());
            }
        } else {
            System.out.println("Penghapusan akun dibatalkan. ^U^");
        }
        return false;
    }
}
