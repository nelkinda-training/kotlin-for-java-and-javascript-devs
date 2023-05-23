import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int MAX = 3;
    public static void main(final String... args) {
        Scanner s = new Scanner(System.in);
        int number = new Random().nextInt(MAX) + 1;
        System.out.println(String.format("Guess my number (it is between 1 and %d)", MAX));
        while (true) {
            int guess = s.nextInt();
            System.out.println(guess == number ?
                "You guessed correctly!" :
                "Haha, wrong!");
        }
    }
}
