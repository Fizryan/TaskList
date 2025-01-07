package task;

public class WorkTask extends Task{
    public WorkTask(String taskName, String description, String createdDate, String dueDate) {
        super(taskName, description, createdDate, dueDate);
    }

    @Override
    public String getTaskType() {
        return "Work";
    }
}
