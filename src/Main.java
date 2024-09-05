import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Remove Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index - 1);
                    break;

                case 4:
                    running = false;
                    System.out.println("Good bye!!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}