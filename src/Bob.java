import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        Scanner phrase = new Scanner(System.in);
        System.out.println("Hey I am BOB, Do you want to talk to me or something?... yes or no bro!");
        String userChoice = word.nextLine();

        if (userChoice.equalsIgnoreCase("Yes")) {
            System.out.println("What?");
        }

        while (userChoice.equalsIgnoreCase("yes")) {

            String userInput = phrase.nextLine();

            if (userChoice.equalsIgnoreCase("Yes")) {


                if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equalsIgnoreCase("bye")) {
                    break;
                } else {
                    System.out.println("Whatever.");
                }
            }

        }
        System.out.println("Then Get Out Of My Way...Gosh");
    }
}

