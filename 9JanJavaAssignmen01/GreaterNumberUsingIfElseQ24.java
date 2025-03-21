// 24. WAP to find greater of two numbers using if else statement.
import java.util.Scanner;

public class GreaterNumberUsingIfElseQ24 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Use if-else statement to find the greater number
        if (num1 > num2) {
            System.out.println("The greater number is: " + num1);
        } else {
            System.out.println("The greater number is: " + num2);
        }

        // Close the scanner
        scanner.close();
    }
}
