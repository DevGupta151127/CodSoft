// Guessing Game

import java.util.Random;
import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        System.out.println("Welcome to Guessing game.");
        Scanner s=new Scanner(System.in);
        System.out.print("Guess a number: ");
        int n=s.nextInt();
        Random rand=new Random();
        int guess=rand.nextInt(100);
        int count=1;
        int game=1;
        while(n!=guess){
            if(count>=5){
                game=0;
                break;
            }
            count++;
            if(n>guess){
                System.out.print("Too high. Try again: ");
            }
            else{
                System.out.print("Too low. Try again: ");
            }
            n=s.nextInt();
        }
        if(game==1){
        System.out.println("You guessed it. It took "+count+" guesses.");
        }
        else{
            System.out.println("You lose. The number was "+guess+".");
        }
        s.close();
    }
}
        