import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = scan.nextDouble();
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Some thing went wrong");
                return;
        }
        System.out.println("The result is: " + result);
    }
}
