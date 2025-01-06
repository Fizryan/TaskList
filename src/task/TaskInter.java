package task;

import user.*;

public interface TaskInter {
    public void addTask(String task);
    public void editTask(int taskID, String updatedTask);
    public void deleteTask(int taskID);
    public void saveTasks();
    public void loadTasks();
}
