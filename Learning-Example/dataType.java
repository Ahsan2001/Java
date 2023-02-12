//  Data types in Java 
/*  String: Used to store characters, such as "Hello, world!".
    int: Used to store Numbers, such as -1, 0, and 1.
    double: Used to store Numbers with decimal values, such as 1.5 or 3.14159.
    char: Used to store single characters, such as 'A' or 'B'. 
    boolean: Used to store true or false values. */ 


public class Main {
  public static void main(String[] args) {
    String fname = "Muhammad Ahsan";
    String lname = "Sabir";
    int age = 21;
    int rollNumber = 03;
    double weight = 70.6;
    char gender = 'M';
    boolean Married = false;
    
    System.out.println("My name is : " + fname + " " + lname);
    System.out.println("Roll # : " + rollNumber);
    System.out.println("Age is : " + age);
    System.out.println("Weight is : " + weight);
    System.out.println("Gender is : " + gender);
    System.out.println("Is Married : " + Married);
  }
}