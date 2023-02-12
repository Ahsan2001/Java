public class Main {
  public static void main(String[] args) {

    String[] names = {"Muhammad", "Ahsan", "Sabir", "Shaikh"};
    
    System.out.println("");
    System.out.println("for loop example with String");
    System.out.println("");

    for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
    }




    String[] cities = {"Karachi", "Lahore", "Islamabad", "Rawalpindi", "Faisalabad"};
    int i = 0;

    System.out.println("");
    System.out.println("While loop example with String");
    System.out.println("");

    while (i < cities.length) {
        System.out.println(cities[i] + " is a city of Pakistan ");
        i++;
    }





  }

}