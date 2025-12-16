import java.util.Scanner;

public class DivisionException {

    public static int divideNumbers(int num, int den) {
        try {
            return num / den;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        int result = divideNumbers(numerator, denominator);

        if (denominator != 0) {
            System.out.println(result);
        }
    }
}