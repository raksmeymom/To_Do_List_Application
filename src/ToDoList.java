import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> task;

    public ToDoList() {
        task = new ArrayList<>();
    }

    public void addTask(String description) {
        task.add(new Task(description));
    }

    public void removeTask(int index) {
        if (index >= 0 && index < task.size()) {
            task.remove(index);
        }
    }

    public void viewTasks() {
        if (task.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < task.size(); i++) {
                System.out.println((i + 1) + ". " + task.get(i).getDescription());
            }
        }
    }
}
