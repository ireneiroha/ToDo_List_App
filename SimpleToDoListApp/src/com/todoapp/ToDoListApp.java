package com.todoapp;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        app.run();
    }

    public void run() {
        while (true) {
            System.out.println("\nSimple To-Do List:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Mark Task Incomplete");
            System.out.println("5. Edit Task");
            System.out.println("6. Delete Task");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> markTaskComplete();
                case 4 -> markTaskIncomplete();
                case 5 -> editTask();
                case 6 -> deleteTask();
                case 7 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added.");
    }

    private void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private void markTaskComplete() {
        viewTasks();
        System.out.print("Enter task number to mark complete: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (isValidTaskNumber(num)) {
            tasks.get(num - 1).markComplete();
            System.out.println("Task marked as complete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void markTaskIncomplete() {
        viewTasks();
        System.out.print("Enter task number to mark incomplete: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (isValidTaskNumber(num)) {
            tasks.get(num - 1).markIncomplete();
            System.out.println("Task marked as incomplete.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void editTask() {
        viewTasks();
        System.out.print("Enter task number to edit: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (isValidTaskNumber(num)) {
            System.out.print("Enter new task description: ");
            String newDescription = scanner.nextLine();
            tasks.get(num - 1).setDescription(newDescription);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (isValidTaskNumber(num)) {
            tasks.remove(num - 1);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private boolean isValidTaskNumber(int num) {
        return num > 0 && num <= tasks.size();
    }
}
