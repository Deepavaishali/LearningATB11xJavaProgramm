package ex_11_loop_concept;

import java.util.Random;
import java.util.Scanner;

public class LAB122_guessing_game {
    public static void main(String[] args) {
        Random random=new Random();
        int numberToGuess=random.nextInt(10)+1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        int guess;
        int attempts=0;

        while(true){
            guess = scanner.nextInt();
            attempts++;

            if(guess<numberToGuess){
                System.out.println("too low, try again");
            }
            else if(guess>numberToGuess){
                System.out.println("too high, try again");
            }
            else{
                System.out.println("correct, you guessed it in " + attempts+"attempts");
                break;//if you didnt give break, loop continues
                //that is, even after guessing the correct number also, if you give guess number, output prints
                //after giving break, it wont print


            }



        }
    }
}
