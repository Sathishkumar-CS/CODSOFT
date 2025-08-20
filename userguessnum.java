import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserGuessNum {
    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(1, 101);
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to guess: ");
        num = sc.nextInt();

        if (num == r) {
            System.out.println("You guessed the correct random number!");
        } else {
            System.out.println("You didn't guess the correct random number.");
            System.out.println("The correct number was: " + r);
        }
    }
}
