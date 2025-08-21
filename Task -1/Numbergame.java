import java.util.*;

public class Numbergame {
    public static void main(String[] args) {
        boolean playagain = true;
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int round = 0;
        int score = 0;

        System.out.println("?? Welcome to the Number Guessing Game!");
        System.out.println("In this game, guess the random number within 1–100. You only have 5 attempts!");

        while (playagain) {
            round++;
            int rannum = ra.nextInt(100) + 1;
            int attempt = 5;
            boolean guesscrt = false;

            System.out.println("\n--- Round " + round + " ---");

            while (attempt > 0) {
                System.out.print("Enter your guess (1-100): ");
                int guess = sc.nextInt();
                attempt--;

                if (guess == rannum) {
                    System.out.println("?? Congratulations! You guessed the correct number!");
                    guesscrt = true;
                    score++;
                    break;
                } else if (guess < rannum) {
                    System.out.println("Your guess is too low! Attempts left: " + attempt);
                } else if (guess > rannum) {
                    System.out.println("Your guess is too high! Attempts left: " + attempt);
                }
            }

            if (!guesscrt) {
                System.out.println("? You ran out of attempts! The number was: " + rannum);
            }

            System.out.println("? Current Score: " + score + " round(s) won out of " + round);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next();
            playagain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\n?? Final Score: " + score + "/" + round);
        System.out.println("Thanks for playing! Goodbye ??");
        sc.close();
    }
}
