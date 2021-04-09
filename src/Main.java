public class Main {

    public static void main(String[] args) {

        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

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

        int [] nubers = {1,2,3,4};
        Task [] tasks = {task1,task2,task3,newtask};
        System.out.println("FOREACH");
        for(Task a : tasks) {
            System.out.println(a);
        }
    }

}
