import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Enter student marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (1 or 0): ");
            
            // Take user choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Take input for student marks
                    System.out.print("Enter student marks (out of 100): ");
                    int marks = scanner.nextInt();

                    // Provide feedback based on marks
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid input. Marks should be between 0 and 100.");
                    }
                    break;

                case 0:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }

        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }
}
