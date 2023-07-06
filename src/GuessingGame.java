import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        System.out.println(secretNumber);

        System.out.println("Hello, Hi! \r What is your name?");
        String name = sc.nextLine();

        int guess;
        System.out.println("Hi " + name + ", Welcome to the guessing game.\n I will give you clues along the way, \n Guess a number from from 1-100");
        do {
            guess = sc.nextInt();
            if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You've got it! Well done!");
            }
        } while (guess != secretNumber);

    }
}
