import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max+1);
        int attempts = 0; 
        int guess = 0; 

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d to %d\n", min , max);

        do {
            System.out.print("Enter a guess ");
            guess = scanner.nextInt();
            attempts ++;
            if(guess < randomNumber){
                System.out.println("Your guess is too low");
            } 
            else if (guess > randomNumber){
                System.out.println("Your guess is too high");
            }
            else {
                System.out.printf("The number was %d and you were able to guess it in %d attempts\n", randomNumber, attempts);
            }
        }while(guess != randomNumber);

        scanner.close();

    }
}
