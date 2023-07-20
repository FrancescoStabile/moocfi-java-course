
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        double number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double number2 = Integer.valueOf(scanner.nextLine());
        double average = (number1 + number2) / 2;
        System.out.println("The average is " + average);

    }
}
