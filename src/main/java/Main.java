/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        //create scanner object with a name of userChoice and initialize with system.in input
        Scanner userChoice = new Scanner(System.in);

        //set random number for user to guess up to 100
        int randomNum = (int) (Math.random() * 101);
        //int randomNum = 88;
        int count = 0;
        int oldGuess = 0;

        System.out.print("Please guess a number: ");

        //declare and reads userGuess input
        int userGuess = userChoice.nextInt();

        do {

            //Asks user for another guess when they consecutively enter two numbers
            if (userGuess == oldGuess) {

                System.out.println("Same guess buddy boi enter another guess: ");

                //get another guess from the user
                userGuess = userChoice.nextInt();
                System.out.println();

                //stores users old guess
                oldGuess = userGuess;

                //if user does give consecutive number guesses tell whether the user is getting close
                }else if (userGuess > randomNum && oldGuess != userGuess) {

                    System.out.println("Your guess was too high.");
                    System.out.print("Your guess was: " + userGuess + ". Please enter another number: ");  // Output user input

                    //stores users old guess
                    oldGuess = userGuess;

                    //get another guess from the user and increments number of guesses
                    userGuess = userChoice.nextInt();
                    System.out.println();
                    count ++;

                } else if (userGuess < randomNum && oldGuess != userGuess) {

                    System.out.println("Your guess was too low.");
                    System.out.print("Your guess was: " + userGuess + ". Please enter another number: ");  // Output user input
                    oldGuess = userGuess;

                    //get another guess from the user and increments number of guesses
                    userGuess = userChoice.nextInt();
                    System.out.println();
                    count ++;

                } else {
                    System.out.println("You did not enter a number");
                }

        } while (userGuess != randomNum);

        System.out.println("You guessed the random number correctly and it took " + count + " guesses.");

    }
}



