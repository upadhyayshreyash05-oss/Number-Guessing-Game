import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            int gNum = random.nextInt(100);
            int att = 10;
            boolean playing = true;

            System.out.println("WELCOME TO THE NUMBER GUSSING GAME !! Guess a number between 0 and 100");
            System.out.println("WARNING : YOU HAVE ONLY 10 ATTEMPTS , BEST OF LUCK ");
            do {
                while (att != 0) {
                    int input = sc.nextInt();

                    if (input == gNum) {
                        System.out.println("YOU WON !!");
                        playing = false;
                        break;
                    } else if (input > gNum) {
                        System.out.println("WRONG ! TRY SMALLER NUMBER");
                        att--;
                        System.out.println("Attempts left = " + att);
                    } else {
                        System.out.println("WRONG ! TRY BIGGER NUMBER");
                        att--;
                        System.out.println("Attempts left = " + att);
                    }

                    if (att < 1) {
                        System.out.println("YOU ARE A LOSER");
                        System.out.println("The number was = " + gNum);
                        playing = false;
                        break;
                    }
                }
            } while (playing);

            System.out.println("WANT TO PLAY AGAIN ? (Y/N)");
            choice = sc.next();

        } while (choice.equals("Y"));

        System.out.println("Thanks for playing. Goodbye!");
        sc.close();
    }
}