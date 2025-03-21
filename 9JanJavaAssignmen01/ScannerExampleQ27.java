import java.util.Scanner;

public class ScannerExampleQ27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter a floating-point number: ");
        float num2 = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = scanner.nextBoolean();

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + num1);
        System.out.println("Floating-point number: " + num2);
        System.out.println("String: " + str);
        System.out.println("Boolean: " + flag);

        scanner.close();
    }
}
