public class GreateroftwoQ22 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;

        System.out.println("The larger number is: " + max);

        String result = (a == b) ? "Equal" : "Not Equal";
        System.out.println("Comparison result: " + result);
    }
}
