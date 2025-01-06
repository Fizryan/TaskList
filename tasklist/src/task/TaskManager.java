package task;

import java.io.*;
import java.util.*;

public class TaskManager implements TaskInter{
    private final String taskFile;
    private List<String> tasks = new ArrayList<>();
    
    public TaskManager(String username){
        this.taskFile = username + ".dat";
        loadTasks();
    }
    
    @Override
    public void addTask(String task){
        tasks.add(task);
        saveTasks();
    }
    
    @Override
    public void editTask(int taskID, String updatedTask){
        if (taskID >= 0 && taskID < tasks.size()){
            tasks.set(taskID, updatedTask);
            saveTasks();
        } else {
            System.out.println("Tugas ID tidak valid!");
        }
    }
    
    @Override
    public void deleteTask(int taskID){
        if (taskID >= 0 && taskID < tasks.size()){
            tasks.remove(taskID);
            saveTasks();
        } else {
            System.out.println("Tugas ID tidak valid!");
        }
    }
    
    @Override
    public void saveTasks(){
        if (tasks.isEmpty()){
            new File(taskFile).delete();
            return;
        }
        File file = new File(taskFile);
        if (taskUsers()){
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
                oos.writeObject(tasks);
            } catch (IOException e){
                System.err.println("Gagal menyimpan tugas: " + e.getMessage());
            }
        }
    }
    
    @Override
    public void loadTasks(){
        File file = new File(taskFile);
        if (file.exists()){
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
                tasks = (List<String>) ois.readObject();
            } catch (Exception e){
                System.err.println("Gagal memuat tugas: " + e.getMessage());
            }
        }
    }
    
    // Getter tugas
    public List<String> getTasks(){
        return tasks;
    }
    
    // Method membuat file data akun
    public boolean taskUsers(){
        File file = new File(taskFile);
        if (!file.exists()){
            try {
                return file.createNewFile();
            } catch (IOException e){
                System.err.println("Gagal membuat file tugas: " + e.getMessage());
            }
        }
        return true;
    }
    
    // Method untuk menampilkan tugas
    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("Belum ada tugas.");
        } else {
            System.out.println("Daftar Tugas:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }
}
