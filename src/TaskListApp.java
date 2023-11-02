import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskListApp {
    private TaskList taskList;

    public static void main(String[] args) {
        TaskListApp app = new TaskListApp();

        app.start();
    }

    public TaskListApp() {
        taskList = new TaskList();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    // Call the method to add a task.
                    addTask();
                    break;
                case 2:
                    // Call the method to remove a task.
                    break;
                case 3:
                    // Call the method to list tasks.
                    break;
                case 4:
                    // Call the method to mark a task as completed.
                    break;
                case 5:
                    // Exit the application.
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        // Gather user input for task name
        System.out.println("Enter the task name: ");
        String name = scanner.nextLine();

        // Gather user input for the task description
        System.out.print("Enter the task description (or 'exit' to quit): ");
        String description = scanner.nextLine();

        if (name.equalsIgnoreCase("exit") || description.equalsIgnoreCase("exit")) {
            System.out.println("Exiting the application. Goodbye!"); // Cancel task creation
        }

        // Gather user input for the due date
        System.out.print("Enter the due date (MM-dd-yyyy): ");
        String dueDateStr = scanner.nextLine();

        Date dueDate = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            dueDate = dateFormat.parse(dueDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Task not added.");
        }

        // Create a Task object and add it to the task list
        taskList.add(new Task(name, description, dueDate));

        System.out.println("Task added successfully!");

        // Close the scanner
        scanner.close();
    }

    public void displayMenu() {
        System.out.println("Task List Menu:");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. List tasks");
        System.out.println("4. Mark a task as completed");
        System.out.println("5. Exit");
    }

}
