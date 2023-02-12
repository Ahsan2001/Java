import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int number = userInput.nextInt();
      userInput.close();
      int result = 1;
      for (int i = 1; i <= number; i++) {
         result *= i;
      }
      System.out.println("The factorial of " + number + " is " + result + ".");
   }
}
