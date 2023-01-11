package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int numToGuess = 8;
        int guess = 0;
        Random random = new Random();
        while(guess != numToGuess) {
            guess = random.nextInt(20) + 1;
            System.out.println("Guess: " + guess);
            if(guess == numToGuess) {
                System.out.println("Hip hip hooray! You guessed the correct number");
            }
        }
    }
}