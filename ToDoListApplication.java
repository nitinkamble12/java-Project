import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApplication {
        public static void main(String[] args) {
                ArrayList<String> tasks = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                        System.out.println("Choose an option:");
                        System.out.println("1. Add a task");
                        System.out.println("2. Mark a task as complete");
                        System.out.println("3. View tasks");
                        System.out.println("4. Remove a task");
                        System.out.println("5. Exit");

                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        switch (choice) {
                                case 1:
                                        System.out.print("Enter the task to add: ");
                                        String newTask = scanner.nextLine();
                                        tasks.add(newTask);
                                        System.out.println("Task added successfully");
                                        break;
                                case 2:
                                        System.out.print("Enter the index of the task to mark as complete: ");
                                        int index = scanner.nextInt();
                                        if (index >= 0 && index < tasks.size()) {
                                                System.out.println(
                                                                "Task '" + tasks.get(index) + "' marked as complete");
                                                tasks.remove(index);
                                        } else {
                                                System.out.println("Invalid index");
                                        }
                                        break;
                                case 3:
                                        if (tasks.isEmpty()) {
                                                System.out.println("No tasks to display");
                                        } else {
                                                System.out.println("Tasks:");
                                                for (int i = 0; i < tasks.size(); i++) {
                                                        System.out.println(i + ". " + tasks.get(i));
                                                }
                                        }
                                        break;
                                case 4:
                                        System.out.print("Enter the index of the task to remove: ");
                                        int removeIndex = scanner.nextInt();
                                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                                                tasks.remove(removeIndex);
                                                System.out.println("Task removed successfully");
                                        } else {
                                                System.out.println("Invalid index");
                                        }
                                        break;
                                case 5:
                                        System.out.println("Exiting...");
                                        System.exit(0);
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }
}
