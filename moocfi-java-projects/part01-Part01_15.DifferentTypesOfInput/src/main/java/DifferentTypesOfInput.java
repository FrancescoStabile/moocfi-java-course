
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String example1 = scan.nextLine();
        System.out.println("Give an integer:");
        int example2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double example3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean example4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + example1);
        System.out.println("You gave the integer " + example2);       
        System.out.println("You gave the double " + example3); 
        System.out.println("You gave the boolean " + example4);
    }
}
