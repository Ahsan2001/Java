// Grade Calculation: Write a program that calculates the grade of a student based on their marks.

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student's score: ");
        double score = scan.nextDouble();
        String grade = "";
        double gpa = 0;
        if (score >= 85 && score <= 100) {
            grade = "A";
            gpa = 4;
        } else if (score >= 80 && score <= 84) {
            grade = "A-";
            gpa = 3.7;
        } else if (score >= 75 && score <= 79) {
            grade = "B+";
            gpa = 3.3;
        } else if (score >= 70 && score <= 74) {
            grade = "B";
            gpa = 3;
        } else if (score >= 65 && score <= 69) {
            grade = "B-";
            gpa = 2.7;
        } else if (score >= 61 && score <= 64) {
            grade = "C+";
            gpa = 2.3;
        } else if (score >= 58 && score <= 60) {
            grade = "C";
            gpa = 2;
        } else if (score >= 55 && score <= 57) {
            grade = "C-";
            gpa = 1.7;
        } else if (score >= 50 && score <= 54) {
            grade = "D";
            gpa = 1;
        } else if (score >= 0 && score <= 49) {
            grade = "F";
            gpa = 0;
        } else {
            System.out.println("Invalid score!");
            return;
        }
        System.out.println("The student's grade is: " + grade);
        System.out.println("The student's GPA is: " + gpa);
    }
}
