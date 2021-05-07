public class Task {
    private String taskName;
    private String taskDescription;
    private String taskCategory;
    private String taskDateTimeStart;
    private String taskDateTimeStop;


    public Task() {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
    }

    public Task(String taskName, String taskDescription, String taskCategory, String taskDateTimeStart, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStart = taskDateTimeStart;
        this.taskDateTimeStop = taskDateTimeStop;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public String getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public void setTaskDateTimeStart(String taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public String getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskDateTimeStop(String taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskCategory='" + taskCategory + '\'' +
                ", taskDateTimeStart='" + taskDateTimeStart + '\'' +
                ", taskDateTimeStop='" + taskDateTimeStop + '\'' +
                '}';
    }
}

