package tasklist;

import java.io.*;

public class User {
    private String username;
    private String password;
    
    public User(String username, String password){
        File file = new File("user.dat");
        if (taskUtil.isFileExist()){
            try (BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                while ((line = reader.readLine()) != null){
                    String[] parts = line.split(":");
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];

                    this.username = storedUsername;
                    this.password = storedPassword;
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    
    // Getter
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
}
