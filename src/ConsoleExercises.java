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



        Scanner sentence = new Scanner(System.in);

        System.out.print("Enter Sentence Here: ");
        String userSentence = sentence.nextLine();// if you used .next() it only grabs the first word.
        System.out.println(userSentence);


        //Calculate perimeter and area of room.

        Scanner measurements = new Scanner (System.in);

        measurements.useDelimiter("\n");

        System.out.print("Enter Width and Length: ");

        //int widthInput = measurements.nextInt();
        //int lengthInput = measurements.nextInt();

        String widthInput = measurements.nextLine();
        String lengthInput = measurements.nextLine();

        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);


        System.out.println("width: " + widthInput);
        System.out.println("length: " + lengthInput);
//        System.out.println("This is the area of the room: " + widthInput * lengthInput + "!");
//        System.out.println("This is the Perimeter of the room: " + (widthInput + lengthInput) * 2 + "!");
        System.out.println("This is the area of the room: " + width * length + "!");
        System.out.println("This is the Perimeter of the room: " + (width + length) * 2 + "!");




    }
}
