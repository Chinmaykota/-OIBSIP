import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int rangeStart = 1; // start of range
        int rangeEnd = 100; // end of range
        int maxAttempts = 5; // maximum number of attempts allowed
        int score = 0; // initialize score to 0
        
        int randomNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        
        System.out.println("Guess a number between " + rangeStart + " and " + rangeEnd + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");
        
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            int guess = input.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
                score += (maxAttempts - attempt + 1) * 10; // give points based on the number of attempts
                break;
            } else if (guess < randomNumber) {
                System.out.println("Try again. The number is higher.");
            } else {
                System.out.println("Try again. The number is lower.");
            }
        }
        
        System.out.println("Your score is " + score + ".");
    }
}
