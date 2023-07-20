
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        double divisione = 1.0 * number1 / number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + sub);
        System.out.println(number1 + " * " + number2 + " = " + mul);
        System.out.println(number1 + " / " + number2 + " = " + divisione);
    }
}
