package bonus_hw_2;

import java.time.LocalDate;

public class AddTaskAction extends Task implements TaskAction {

    public AddTaskAction(String name, String description, Priority priority, LocalDate deadline, Status status) {
        super(name, description, priority, deadline, status);

    }

    @Override
    public void perform() {
        Task task = new Task(name, description, priority, deadline, status);
    }
}
