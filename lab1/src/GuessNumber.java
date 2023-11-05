package lab1.src;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private static final int MAX_STEPS = 5;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        int numberDrawn = generateNumber();
        playGame(numberDrawn);
    }

    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER + 1);
    }

    private static void playGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);

        boolean isWin = false;

        System.out.println("Odgadywanie liczby od 0 do "+ MAX_NUMBER +".");

        for (int i = 0; i < MAX_STEPS; i++) {
            System.out.print("Spróbuj odgadnąć liczbę (pozostało prób: " + (MAX_STEPS - i) +"): ");
            int myNumber = scanner.nextInt();

            if (myNumber < numberToGuess) {
                System.out.println("Twoja liczba jest mniejsza od szukanej liczby.");
            } else if (myNumber > numberToGuess) {
                System.out.println("Twoja liczba jest większa od szukanej liczby.");
            } else {
                System.out.println("Udało Ci się odgadnąć liczbę! Szukana liczba to " + numberToGuess);
                isWin = true;
                break;
            }
        }

        if (!isWin) {
            System.out.println("Niestety nie udało Ci się odgadnąć liczby. Szukana liczba to " + numberToGuess);
        }

        scanner.close();

    }
}
