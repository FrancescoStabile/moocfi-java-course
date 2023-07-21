
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0, sum = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            double temp = Double.valueOf(scanner.nextLine());
            if (temp == 0) {
                break;
            } else {
                num = num + 1;
                sum = sum + temp;
            }
        }
        average = sum / num;
        System.out.println("Average of the numbers: " + average);
    }
}
