import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    // Default constructor
    public TaskList() {
        tasks = new ArrayList<Task>();
    }

    // Overloaded constructor
    public TaskList(Task task) {
        tasks = new ArrayList<Task>();
        tasks.add(task);
    }

    public void add(Task task) {
        if (task.getDescription().isEmpty() || task.getDueDate() == null) {
            System.out.println("Error: Task description and due date are required.");
        } else {
            tasks.add(task);
        }
    }

    // Removes tasks from the list based on what number (index) the task was
    // assigned.
    // @param number the index of the task, -1 for indexing purposes.
    public void remove(int number) {
        if (tasks.isEmpty()) {
            System.out.println("Error: Task list is empty.");
        } else if (number - 1 < 0 || number - 1 >= tasks.size()) {
            System.out.println("Error: Invalid task index.");
        } else {
            tasks.remove(number - 1);
            System.out.println("Task removed successfully!");
        }
    }

    // @param number the index of the task, -1 for indexing purposes.
    public void markAsCompleted(int number) {
        if (tasks.isEmpty()) {
            System.out.println("Error: Task list is empty.");
        } else if (number - 1 < 0 || number - 1 >= tasks.size()) {
            System.out.println("Error: Invalid task index.");
        } else if (tasks.get(number - 1).isCompleted()) {
            System.out.println("Error: Task is already completed.");
        } else {
            tasks.get(number - 1).markAsCompleted();
            System.out.println("Task marked as completed!");
        }
    }

    public int getTotalNumberOfTasks() {
        return tasks.size();
    }

    public String getTask(int number) {
        return tasks.get(number - 1).toString();
    }

    // Prints a list of tasks.
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            for (Task t : tasks) {
                System.out.println(t.toString());
            }
        }
    }
}
