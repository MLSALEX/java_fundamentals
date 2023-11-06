package bonus_hw_2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task t1 = new Task("task1", "description of the task1", Priority.MEDIUM, LocalDate.of(2023,11,10), Status.IN_PROCESS );
        Task t2 = new Task("task2", "description of the task2", Priority.LOW, LocalDate.of(2023,11,12), Status.IN_PROCESS );
        Task t3 = new Task("task3", "description of the task3", Priority.HIGH, LocalDate.of(2023,11,12), Status.PENDING );
        taskManager.addNewTask(t1);
        taskManager.addNewTask(t2);
        taskManager.addNewTask(t3);
        taskManager.completeTask(t1);
        taskManager.displayTasks();
    }
}
