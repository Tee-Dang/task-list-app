import java.util.Scanner;

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
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            displayMenu();

            int choice;
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call the method to add a task.
                    taskList.addTask();
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
                    running = false;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

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
