package tasklist;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class taskUtil {
    // Fungsi check akun user
    public static boolean isFileExist(){
        File file = new File("user.dat");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created successfully.");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    
    // Fungsi check data Task User
     public static boolean isDataExist(){
        File file = new File("user.dat");
        if (isFileExist()){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null){
                    String[] parts = line.split(":");
                    String fileName = parts[0];
                    if (fileName.equals(PasswordManager.getCurrentAccount())){
                        File userFile = new File(fileName + ".dat");
                        if (!userFile.exists()) {
                            try {
                                userFile.createNewFile();
                                System.out.println("File created successfully.");
                                return true;
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }       
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return true;
    }
    
    // fungsi ngambil tanggal sekarang
    public static String currentDate(){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        return today.format(formatter);
    } 
    
    // Fungsi untuk save ke file .dat
    public static void saveDataToFile(String username, String addTaskField, int addDueDateField) {
        LocalDate today = LocalDate.now();
        LocalDate dueDate = today.plusDays(addDueDateField);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");   
        
        File file = new File(username + ".dat");
        if (isDataExist()){
            List<String> lines = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null){
                    lines.add(line);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                for (String line : lines){
                    writer.write(line);
                    writer.newLine();
                }
                
                writer.write(addTaskField + ":" + dueDate.format(formatter));
                System.out.println("Data Saved");
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    
    // fungsi buat load data task di .dat
    public static void loadDataToList(String username, javax.swing.JTable DataTaskList) {
        File file = new File(username + ".dat");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Task");
        tableModel.addColumn("Today");
        tableModel.addColumn("Due Date");
        tableModel.addColumn("Days Remaining");
        
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(":");
                    String title = parts[0];
                    String dueDate = parts[1];
                    
                    LocalDate currentDate = LocalDate.parse(currentDate(), formatter);
                    LocalDate DueDate = LocalDate.parse(dueDate, formatter);
                    long daysBetween = ChronoUnit.DAYS.between(currentDate, DueDate);
                    
                    tableModel.addRow(new Object[]{title, currentDate(), dueDate, daysBetween});
                }
                System.out.println("File Loaded");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        
        DataTaskList.setModel(tableModel);
    }
    
    // fungsi buat delete Task
    public static void deleteRow(String username, javax.swing.JTable DataTaskList){
        File file = new File(username + ".dat");
        List<String> lines = new ArrayList<>();
        int selectedRow = DataTaskList.getSelectedRow();
        
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (selectedRow >= 0 && selectedRow < lines.size()) {
                lines.remove(selectedRow);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (String line : lines) {
                        writer.write(line);
                        writer.newLine();                       
                    }
                    System.out.println("Task deleted.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    // fungsi sorting task
    public static void sortDataInFile(String username){
        File file = new File(username + ".dat");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        
        if (file.exists()){
            List<String[]> tasks = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.isBlank()){
                        break;
                    }
                    String[] parts = line.split(":");
                    String task = parts[0];
                    String dueDate = parts[1];

                    tasks.add(new String[]{task, dueDate});
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            tasks.sort((task1, task2) -> {
                LocalDate date1 = LocalDate.parse(task1[1], formatter);
                LocalDate date2 = LocalDate.parse(task2[1], formatter);
                return date1.compareTo(date2);
            });
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String[] task : tasks) {
                    writer.write(task[0] + ":" + task[1]);
                    writer.newLine();
                }
                System.out.println("Task sorted.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Fungsi buat edit data di Table di simpan ke file .dat
    public static void editSaveToFile(String username, javax.swing.JTable DataTaskList){
        File file = new File(username + ".dat");
        boolean wrongFormat = false;
        boolean pastDate = false;

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate today = LocalDate.now();

        for (int row = 0; row < DataTaskList.getRowCount(); row++) {
            String dueDate = (String) DataTaskList.getValueAt(row, 2);
                try {
                    LocalDate date = LocalDate.parse(dueDate, dateFormatter);
                    if (date.isBefore(today)) {
                    pastDate = true;
                    break;
                    }
                } catch (DateTimeParseException e) {
                    wrongFormat = true;
                    break;
                }
        }

        if (file.exists()) {
            if (!wrongFormat && !pastDate) {
                List<String> lines = new ArrayList<>();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    for (int row = 0; row < DataTaskList.getRowCount(); row++) {
                        String task = (String) DataTaskList.getValueAt(row, 0);
                        String dueDate = (String) DataTaskList.getValueAt(row, 2);
                        lines.add(task + ":" + dueDate);
                    }
                    for (String updatedLines : lines) {
                        System.out.println(updatedLines);
                        writer.write(updatedLines);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (wrongFormat) {
                JOptionPane.showMessageDialog(null, "Format penulisan tanggal salah. Gunakan format dd-MM-yy.", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (pastDate) {
                JOptionPane.showMessageDialog(null, "Tanggal tenggat tidak boleh di bawah hari ini.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
