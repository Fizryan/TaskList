package tasklist;

import java.io.*;

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
        
        return false;
    }
     
    // Fungsi untuk save ke file .dat
    public static void saveDataToFile(String username, String Data) {
        File file = new File(username + ".dat");
        if (isFileExist()){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(username + ":" + Data);
                writer.newLine();
                System.out.println("Data Saved");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
