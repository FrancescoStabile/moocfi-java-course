
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int temp = Integer.valueOf(scanner.nextLine());
            if (temp == 0) {
                break;
            } else {
                num = num + 1;
            }
        }
        System.out.println("Number of numbers: " + num);
    }
}
