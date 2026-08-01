import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        // 1. Print a message to the console
        System.out.println("Welcome to your first Java Program!");

        // 2. Variables and Data Types
        int maxNumber = 5;
        String message = "Counting up to: ";
        System.out.println(message + maxNumber);

        // 3. For Loop (Control Flow)
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println("Number: " + i);
        }

        // 4. Taking User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        // 5. Conditional Statement (If-Else)
        if (name.isEmpty()) {
            System.out.println("You didn't type a name!");
        } else {
            System.out.println("Hello, " + name + "! Have a great day coding.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
