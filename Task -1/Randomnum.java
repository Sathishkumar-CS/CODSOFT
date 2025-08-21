import java.util.concurrent.ThreadLocalRandom;

public class Randomnum {
    public static void main(String[] args) {
        int r = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("The Generation of random number between 1 to 100 : " + r);
    }
}
