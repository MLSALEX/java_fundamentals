package bonus_hw_2;

public class CompleteTaskAction implements TaskAction {
    private Task task;

    public CompleteTaskAction(Task task) {
        this.task = task;
    }

    @Override
    public void perform() {
        task.status = Status.COMPLETED;
    }
}
