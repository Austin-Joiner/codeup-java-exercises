import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f.%n", pi);     // f stands for float and the number 2 is how many numbers are after decimal and adding a period after f adds a period at the end I could keep writing after the f if I wanted to.


        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int userInput = input.nextInt(); // error will occur if it's not a number

        System.out.println("You Chose Number " + userInput + "!");


        Scanner word = new Scanner(System.in);


        System.out.print("Enter Three Words: ");
        String userWordOne = word.next();
        String userWordsTwo = word.next();
        String userWordsThree = word.next();

        System.out.println("Your Three Words Are: " + "\n" + userWordOne + "\n" + userWordsTwo + "\n" + userWordsThree);// if you enter less than three words it does nothing because the console is still waiting for 3 words and if you do more than three than it only includes the first 3.


    }
}
