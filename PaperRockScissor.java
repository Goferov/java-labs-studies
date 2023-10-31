import java.util.Random;
import java.util.Scanner;

public class PaperRockScissor {

    public static final String[] choices = {"PAPIER", "KAMIEŃ", "NOŻYCZKI"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userChoice, computerChoice;

        System.out.println("Gra Papier-Kamień-Nożyczki");
        System.out.println("Wybierz: 0 - PAPIER, 1 - KAMIEŃ, 2 - NOŻYCZKI");
        userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice >= choices.length) {
            System.out.println("Nieprawidłowy wybór. Wybierz 0, 1, lub 2.");
            return;
        }

        computerChoice = random.nextInt(choices.length);
        System.out.println("Twój wybór: " + choices[userChoice]);
        System.out.println("Wybór komputera: " + choices[computerChoice]);

        switch ((userChoice - computerChoice + 3) % 3) {
            case 0 -> System.out.println("Remis!");
            case 1 -> System.out.println("Przegrałeś! " + choices[computerChoice] + " pokonuje " + choices[userChoice]);
            case 2 -> System.out.println("Wygrałeś! " + choices[userChoice] + " pokonuje " + choices[computerChoice]);
        }
    }
}
