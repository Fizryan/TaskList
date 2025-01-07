package task;

public class PersonalTask extends Task {
    public PersonalTask(String taskName, String description, String createdDate, String dueDate) {
        super(taskName, description, createdDate, dueDate);
    }

    @Override
    public String getTaskType() {
        return "Personal";
    }
}
