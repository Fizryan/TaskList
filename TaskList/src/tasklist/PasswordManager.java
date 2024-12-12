package tasklist;

import java.io.*;
import java.security.*;
import java.util.Arrays;

public class PasswordManager{
    private static String currentAccount;
    
    // Check username
    public static boolean isUsernameMatch(String RgsUsernameField){
        if (RgsUsernameField == null || RgsUsernameField.length() < 1){
            return false;
        } else {
            return !usernameCheck(RgsUsernameField);
        }
    }
    
    // Check Password & Repeat Password Pada Register
    public static boolean isPasswordMatch(char[] passwordRegChar, char[] passwordRegRepChar){
        return Arrays.equals(passwordRegChar, passwordRegRepChar) && passwordRegChar != null && passwordRegRepChar != null && passwordRegChar.length > 0 && passwordRegRepChar.length > 0;
    }
      
    // Untuk Encrpyt Password
    public static String encryptPassword(String password) throws UnsupportedEncodingException {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }

    // Fungsi untuk menyimpan password ke file .dat
    public static void savePasswordToFile(String username, char[] password) {
        System.out.println("Account Created");
        String pass = new String(password);
        File file = new File("user.dat");
        if (taskUtil.isFileExist()){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                String encryptedPassword = encryptPassword(pass);
                writer.write(username + ":" + encryptedPassword);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Fungsi untuk login dengan mengecek password dari file .dat
    public static boolean login(String username, char[] password) {
        String pass = new String(password);
        File file = new File("user.dat");

        if (taskUtil.isFileExist()){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null){
                    String[] parts = line.split(":");
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];

                    if (storedUsername.equals(username) && storedPassword.equals(encryptPassword(pass))){
                        currentAccount = storedUsername;
                        return true;
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    // Fungsi untuk logout
    public static void logout(){
        currentAccount = null;
    }

    // Fungsi untuk membaca data username dengan mengecek username dari file .dat
    public static boolean usernameCheck(String username) {
        File file = new File("user.dat");
        
        if (taskUtil.isFileExist()){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String[] blank = {"", " ", "  ", "   ", "    "};
                String line;
                while ((line = reader.readLine()) != null){
                    String[] parts = line.split(":");
                    String storedUsername = parts[0];
                    for (int i = 0; i < 5; i++) {
                        if (storedUsername.equals(username) || username.equals(blank[i]) || username.isBlank()){
                            return true;
                        }
                    }  
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    // Getter
    public static String getCurrentAccount() {
        return currentAccount;
    }
}
