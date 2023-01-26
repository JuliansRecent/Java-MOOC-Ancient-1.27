
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for a year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());
        // If the number is smaller than 2015, print Ancient history!
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
