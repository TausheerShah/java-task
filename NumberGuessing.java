import java.util.Scanner;
import java.util.Random;
public class NumberGuessing
{
    public static void main(String[] args) 
    {
        int i,j,k; 
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        while (playAgain) 
        {
            j = rand.nextInt(100) + 1;
            i = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have generated a number between 1 and 100. Try to guess it!");
            do 
            {
                System.out.print("Enter your guess: ");
                k = sc.nextInt();
                i++;
                if (k < j)
                {
                    System.out.println("Too low. Try again.");
                }
                 else if (k > j ) 
                {
                    System.out.println("Too high. Try again.");
                } 
                else 
                {
                    System.out.println("Congratulations! You've guessed the number " + j  + " correctly in " + i + " attempts.");
                }
            } 
            while (k != j );
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next();
            if (!playAgainInput.equalsIgnoreCase("yes")) 
            {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}