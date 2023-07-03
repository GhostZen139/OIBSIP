//Number guessing game
import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);          //Generating random-number
        int attempts = 0;                               //Intializing no. of attempts
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("<< Welcome to the Game >>");
        System.out.println("\n\nEnter any number between 1 to 100\n");
        
        while (true) {
            System.out.print("Enter your Number: ");
            int guessedNumber = scanner.nextInt();
            attempts++;                               //No of attempts will be incresed in guess
            
            if (guessedNumber < randomNumber) {
                System.out.println("Enter higher number");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Enter lower number");
            } else {
                System.out.println("\nCongratulations! You guessed the right number in " + attempts + " attempts,");
                System.out.println("The Random number is  = "+randomNumber);
                break;
            }
        }
    }
}
