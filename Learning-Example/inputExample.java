import java.util.Scanner;

public class InputOutput {
   public static void main(String[] args) {
      Scanner takeINput = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = takeINput.nextLine();
      System.out.print("Enter your age: ");
      int age = takeINput.nextInt();
      takeINput.close();
      System.out.println("Hello, " + name + "! You are " + age + " years old.");
   }
}




