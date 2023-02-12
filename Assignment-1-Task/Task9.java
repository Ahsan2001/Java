// Write a program that read breadth and height to find the area of the triangle.

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the breadth of the triangle: ");
        double breadth = scan.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scan.nextDouble();
        double area = 0.5 * breadth * height;
        System.out.println("The area of the triangle is: " + area);
    }
}
