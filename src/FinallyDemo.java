import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read two integers
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Perform division
            // If b is 0, this line throws an ArithmeticException
            int result = a / b;
            
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // e.getMessage() usually returns "/ by zero"
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This code runs no matter what happened above
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}
