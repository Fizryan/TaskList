package tasklist;

import java.util.Scanner;
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
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
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
                System.out.println("Login Berhasil. Selamat datang, " + currentAccount.getUsername());
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
            loginMenu();
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
            int choice = scanner.nextInt();
            scanner.nextLine();
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
                    deleteAccount();
                    return;
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
        System.out.print("Masukan tugas baru: ");
        String task = scanner.nextLine();
        taskManager.addTask(task);
        System.out.println("Tugas berhasil ditambahkan.");
    }
    
    private void editTask(TaskManager taskManager){
        taskManager.displayTasks();
        System.out.print("Masukkan ID tugas yang ingin diubah: ");
        int taskID = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.print("Masukkan tugas baru: ");
        String updatedTask = scanner.nextLine();
        taskManager.editTask(taskID, updatedTask);
        System.out.println("Tugas berhasil diubah.");
    }
    
    private void deleteTask(TaskManager taskManager){
        taskManager.displayTasks();
        System.out.print("Masukkan ID tugas yang ingin dihapus: ");
        int taskID = scanner.nextInt() - 1;
        scanner.nextLine();
        taskManager.deleteTask(taskID);
        System.out.println("Tugas berhasil dihapus.");
    }
    
    private void changePassword(){
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
    
    private void deleteAccount(){
        System.out.println("Apakah kamu yakin ingin menghapus akun " + currentAccount.getUsername() + " ini? (y/n)");
        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y") || confirmation.equalsIgnoreCase("yes")){
            try {
                userManager.deleteAccount(currentAccount.getUsername(), currentAccount.getPassword());
                System.out.println("Akun berhasil dihapus. Terima Kasih telah menggunakan program ini");
                System.out.println("Semoga kita bertemu lagi T_T");
                currentAccount = null;
            } catch (IllegalArgumentException e){
                System.out.println("Gagal menghapus akun: " + e.getMessage());
            }
        } else {
            System.out.println("Penghapusan akun dibatalkan. ^U^");
        }
    }
}
