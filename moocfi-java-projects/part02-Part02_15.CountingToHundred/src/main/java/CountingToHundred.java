
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userValue = Integer.valueOf(scanner.nextLine());

        for (int i = userValue; i < 101; i++) {
            System.out.println(i);
        }
    }
}
