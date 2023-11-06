package bonus_hw_2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks = new ArrayList<>();

     public void addNewTask(Task task){
        tasks.add(task);
     }
     public void displayTasks(){
         for (Task task:
              tasks) {
             System.out.println("-------" + task.name + "-----------------");
             System.out.println(task.description + "| "+ task.priority + "| "+ task.deadline + "| "+ task.status);
         }
     }
     public void completeTask (Task task) {
         CompleteTaskAction c = new CompleteTaskAction(task);
         c.perform();
     }
     public void deleteTask(Task task){
         tasks.remove(task);
     }
}
