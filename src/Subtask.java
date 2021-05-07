public class Subtask extends Task {
    private String subtaskName;

    public Subtask() {
    }

    public Subtask(String taskName, String taskDescription, String taskCategory, String taskDateTimeStart, String taskDateTimeStop, String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStart, taskDateTimeStop);
        this.subtaskName = subtaskName;
    }

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                "} " + super.toString();
    }
}
