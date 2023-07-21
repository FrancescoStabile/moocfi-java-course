
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("GIve a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 4) {
                break;
            }
        }
    }
}
