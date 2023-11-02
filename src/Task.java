import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String name, description;
    private Date dueDate;
    private boolean isCompleted;

    // Default constructor
    public Task() {
        name = "Task";
        description = "Task";
        dueDate = new Date();
        isCompleted = false;
    }

    // Overloaded constructor
    public Task(String name, String description, Date dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        isCompleted = false;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String dueDateString = (dueDate != null) ? dateFormat.format(dueDate) : "N/A";
        String status = (isCompleted) ? "Completed" : "Not Completed";
        return "Description: " + description + "\nDue Date: " + dueDateString + "\nStatus: " + status;
    }

}
