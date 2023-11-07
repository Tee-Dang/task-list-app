import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TaskList {
    private ArrayList<Task> list;

    // Default constructor
    public TaskList() {
        list = new ArrayList<Task>();
    }

    // Overloaded constructor
    public TaskList(Task task) {
        list = new ArrayList<Task>();
        list.add(task);
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter the due date (MM-dd-yyy): ");
        String dueDateStr = scanner.nextLine();

        Date dueDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            dueDate = dateFormat.parse(dueDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Task creation canceled.");
        }

        scanner.close();
        Task t = new Task(name, description, dueDate);
        list.add(t);
        System.out.println("Task added successfully!");
        System.out.println(t.toString());

    }

    // Removes tasks from the list based on what number (index) the task was
    // assigned.
    // @param number the index of the task, -1 for indexing purposes.
    public void removeTask(int number) {

    }

    // @param number the index of the task, -1 for indexing purposes.
    public void markTaskAsCompleted(int number) {

    }

    public int getTotalNumberOfTasks() {
        return list.size();
    }

    public String getTask(int number) {
        return list.get(number - 1).toString();
    }

    // Prints a list of tasks.
    public void listTasks() {
        if (list.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            for (Task t : list) {
                System.out.println(t.toString());
            }
        }
    }
}
