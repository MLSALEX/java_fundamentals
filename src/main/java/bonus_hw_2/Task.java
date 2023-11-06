package bonus_hw_2;

import java.time.LocalDate;

public class Task {
    public String name;
    public String description;
    public Priority priority;
    public LocalDate deadline;
    public Status status;

    public Task(String name, String description, Priority priority, LocalDate deadline, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
    }
}
