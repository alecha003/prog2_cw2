public class Main {

    public static void main(String[] args) {

        Task task1 = new Subtask();
        Task task2 = new Subtask();
        Task task3 = new Subtask();

        task1.setTaskName("zadanie1");
        task1.setTaskDescription("jeden");
        task1.setTaskCategory("proste");
        task1.setTaskDateTimeStart("20-03-2021");
        task1.setTaskDateTimeStop("10-04-2021");

        task2.setTaskName("zadanie2");
        task2.setTaskDescription("dwa");
        task2.setTaskCategory("umiarkowane");
        task2.setTaskDateTimeStart("20-03-2021");
        task2.setTaskDateTimeStop("10-04-2021");

        task3.setTaskName("zadanie3");
        task3.setTaskDescription("trzy");
        task3.setTaskCategory("trudne");
        task3.setTaskDateTimeStart("20-03-2021");
        task3.setTaskDateTimeStop("10-04-2021");

        System.out.println(task1.toString());
        System.out.println(task2.toString());
        System.out.println(task3.toString());


        Task newtask = new Task();
        newtask.setTaskDateTimeStop("10-07-2021");

        int[] nubers = { 1, 2, 3, 4 };
        Task[] tasks = { task1, task2, task3, newtask };
        System.out.println("FOREACH");
        for (Task a : tasks) {
            System.out.println(a);
        }

        Object task4 = new Subtask("lab02_1", "description lab02_1", "category lab02_1", "taskDateTimeStart lab02_1", "taskDateTimeStop lab02_1", "subtask lab02_1");
        Object task5 = new Subtask("lab02_2", "description lab02_2", "category lab02_2", "taskDateTimeStart lab02_2", "taskDateTimeStop lab02_2", "subtask lab02_2");
        Object task6 = new Subtask("lab02_3", "description lab02_3", "category lab02_3", "taskDateTimeStart lab02_3", "taskDateTimeStop lab02_3", null);

        getDetailInfo(task4);
        getDetailInfo(task5);
        getDetailInfo(task6);
    }

    public static void getDetailInfo(Object o) {
        if (o instanceof Task) {
            Task task = (Task) o;
            printInfo("taskName", task.getTaskName());
            printInfo("taskDescription", task.getTaskDescription());
            printInfo("taskCategory", task.getTaskCategory());
            printInfo("taskDateTimeStart", task.getTaskDateTimeStart());
            printInfo("taskDateTimeStop", task.getTaskDateTimeStop());
        }

        if (o instanceof Subtask) {
            Subtask subtask = (Subtask) o;
            printInfo("subtaskTitle", subtask.getSubtaskName());
        }
    }

    public static void printInfo(String name, String value) {
        if (value == null) {
            value = "B/D";
        }
        System.out.printf("| %s | %s |%n", name, value);
    }
}
