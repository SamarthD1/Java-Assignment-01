import java.util.Scanner;

public class EvenOrOddQ25 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        // Close the scanner
        scanner.close();
    }
}
