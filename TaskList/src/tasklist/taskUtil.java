package tasklist;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

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
    
    public static void loadDataToList(String username, javax.swing.JList<String> DataTaskList) {
        File file = new File(username + ".dat");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        
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
                    
                    listModel.addElement(title + "      Today: " + currentDate() + "      Due Date: " + dueDate + "     Days Remaining: " + daysBetween);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        
        DataTaskList.setModel(listModel);
    }
}
