// Write a program which read input radius r and find area of the circle.

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double area = 3.142 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
