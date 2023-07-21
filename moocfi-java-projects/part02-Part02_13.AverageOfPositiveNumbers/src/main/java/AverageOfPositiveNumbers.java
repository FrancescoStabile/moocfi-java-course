
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            } else if (userInput > 0) {
                num = num + 1;
                sum = sum + userInput;
            }
        }
        if (num == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / (double) num;
            System.out.println(average);
        }
    }
}
