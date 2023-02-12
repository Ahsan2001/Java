import java.util.Scanner;

public class GBToMB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of GB: ");
        double gb = scan.nextDouble();
        double mb = gb * 1024;
        double kb = mb * 1024;
        double bytes = kb * 1024;
        double bits = bytes * 8;
        System.out.println(gb + " GB is equal to " + mb + " MB");
        System.out.println(gb + " GB is equal to " + kb + " KB");
        System.out.println(gb + " GB is equal to " + bytes + " Bytes");
        System.out.println(gb + " GB is equal to " + bits + " bits");
    }
}
