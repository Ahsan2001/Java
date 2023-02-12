

import java.util.Scanner;

public class Average {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();
      sc.close();
      int average = (num1 + num2) / 2;
      System.out.println("The average of " + num1 + " and " + num2 + " is " + average + ".");
   }
}
