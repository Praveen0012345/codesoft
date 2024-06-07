import java.util.*;

class Task1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome to playground");
        System.out.println("Hey! You have about to win the game" + chances);
        while (playAgain) {
            int rand = getRand(1, 100);
            boolean guess = false;
            for (int i = 0; i < chances; i++) {
                System.out.println("Chance " + (i + 1) + ". Enter your guess: ");
                int user = sc.nextInt();
                if (user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won it.");
                    break;
                } else if (user > rand) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low.");
                }
            }
            if (!guess) {
                System.out.println("Sorry! You lost. The number was " + rand);
            }
            System.out.println("Do you want to play again? (y/n)");
            String pA = sc.next();
            playAgain = pA.equalsIgnoreCase("y");
        }
        System.out.println("That's it, hope you enjoyed!");
        System.out.println("Here is your score: " + finals);
        sc.close(); // Closing the scanner object
    }

    public static int getRand(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
