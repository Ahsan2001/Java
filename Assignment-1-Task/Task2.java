// 1. Minimum of Three Numbers: Write a program that finds the minimum number out of three numbers.
import java.util.Scanner;

public class FindMaximum {

    static int findingMethod(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
 
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 5;
        int result = findingMethod(num1, num2, num3);
        System.out.println("The Minimum number is: " + result);
   }
}