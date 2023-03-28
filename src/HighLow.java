import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String[] args) {
        HighLow play = new HighLow();
        int rand = play.randomNumber();
        play.guessNumber(rand);
    }




    public int randomNumber() {
        Random randomNum = new Random();

            int random = randomNum.nextInt(100) + 1;
            System.out.println(random);
            return random;
    }


    int guessCount = 0;
    int gameWins = 0;
    int gameslost = 0;
    public void guessNumber(int rand) {

        System.out.println("Games won: " + gameWins);
        System.out.println("Games lost: " + gameslost);

        System.out.println("Guess The Number? 1 - 100");
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Guess Count: " + guessCount);

        if (guessCount < 5) {


            int userGuess = userScanner.nextInt();
            if (userGuess == rand) {
                System.out.println("GOOD GUESS!");
                guessCount += 1;
                System.out.println("You Beat the game in " + guessCount + " guesses.");
                guessCount = 0;
                gameWins += 1;

                System.out.println("Total Games Won: " + gameWins);
                System.out.println("Total Games Lost: " + gameslost);



                System.out.println("If you want to play again type in \"yes\"");
                Scanner playAgain = new Scanner(System.in);
                String userPlay = playAgain.nextLine();
                if (userPlay.equalsIgnoreCase("yes")) {

                    guessNumber(randomNumber());//

                } else {
                    System.out.println("Goodbye.");
                }
            } else if (userGuess < rand && userGuess > 0) {
                System.out.println("HIGHER");
                guessCount += 1;
                guessNumber(rand);

            } else if (userGuess > rand && userGuess < 101) {
                System.out.println("LOWER");
                guessCount += 1;
                guessNumber(rand);

            } else if (userGuess > 100 || userGuess < 1) {
                System.out.println("That is invalid it needs to be between 1-100. Try Again.");
                guessNumber(rand);
            }
        } else {
            System.out.println("You Lose! MUHAHAHA!");
            gameslost += 1;
            guessCount = 0;

            System.out.println("Total Games Won: " + gameWins);
            System.out.println("Total Games Lost: " + gameslost);

            System.out.println("If you want to play again type in \"yes\"");
            Scanner playAgainLost = new Scanner(System.in);
            String userPlayLost = playAgainLost.nextLine();
                if (userPlayLost.equalsIgnoreCase("yes")) {

                    guessNumber(randomNumber());//

                } else {
                    System.out.println("Goodbye.");
                }
            }
        }
    }

