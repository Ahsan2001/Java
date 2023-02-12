// 1. Maximum of Three Numbers: Write a program that finds the largest number out of three numbers.
import java.util.Scanner;

public class FindMaximum {
   public static int takenNumbers(int num1, int num2, int num3) {
      int max = num1;
      if (num2 > max) {
         max = num2;
      }
      if (num3 > max) {
         max = num3;
      } else {
        System.out.print("Something went Wrong !");
      }
      return max;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.print("Enter the second number: ");
      int num2 = sc.nextInt();
      System.out.print("Enter the third number: ");
      int num3 = sc.nextInt();
      sc.close();
      int max = takenNumbers(num1, num2, num3);
      System.out.println("The largest number is: " + max);
   }
}