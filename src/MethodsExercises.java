import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static int adding(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int remainder(int x, int y) {
        return x % y;
    }


    // multiply loop with recursion without recursion
//    public static int multiplyLoop(int x, int y) {
//        int total = 0;
//        for (int i = 1; i <= x; i++) {
//                total += y;
//        }
//        return total;
//    }

    // multiply loop with recursion
        public static int multiplyLoop(int x, int y) {
            if (x == 0) {
                return 0;
            } else {
                return y + multiplyLoop(x - 1, y);
            }
         }


    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput >= min && userInput <= max) {

            System.out.printf("Good Job Your number is between %d amd %d \n", min, max);
            return userInput;

        } else {
            System.out.println("TSK TSK that number is not between the range i gave you.");
            return getInteger(min, max);
        }

    }


    public static void factorialValidate() {
        System.out.println("Do you Want to find a factorial of a number. Y/N");
        Scanner chose = new Scanner(System.in);
        boolean userDecision = chose.next().equalsIgnoreCase("Y");


        if(userDecision) {
            System.out.print("Enter a number between 1 and 20.");
            Scanner factInput = new Scanner(System.in);
            int factorialInput = factInput.nextInt();

            System.out.println("You Chose the number: " + factorialInput);



            if (factorialInput >= 1 && factorialInput <= 20) {

                long factorial = 1;


                for (int i = 1; i <= factorialInput; i++ ) {

                    factorial *= i;
                }
                System.out.println("The factorial is: " + factorial);
                factorialValidate();

            } else {
                System.out.println("However that is a Invalid response");
                factorialValidate();
            }
        } else {
            System.out.println("GoodBye");
        }

    }


    public static void diceRoller () {


        System.out.println("How many sides does the dice have?");
        Scanner diceScanner = new Scanner(System.in);
        int diceSides = diceScanner.nextInt();

        System.out.println("You Chose a " + diceSides + " sided dice.");
        System.out.println("Now type \"roll\" to roll the dice.");
        Scanner roll = new Scanner(System.in);
        String rollValidate = roll.nextLine();

        if(rollValidate.equalsIgnoreCase("Roll")) {



            int randDiceOne = (int)(Math.random() * diceSides) + 1;
            int randDiceTwo = (int)(Math.random() * diceSides) + 1;

            int diceOne = randDiceOne;
            int diceTwo = randDiceTwo;

            //Random randomRoll = new Random();

//            int diceOne = randomRoll.nextInt(diceSides) + 1;
//            int diceTwo = randomRoll.nextInt(diceSides) + 1;

            int totalRoll = diceOne + diceTwo;

            System.out.println("Dice one: " + diceOne + "\nDice two: " + diceTwo);
            System.out.println("Your Total Roll is: " + totalRoll);
            System.out.println("Would you like to roll again?");

            Scanner rollMore = new Scanner(System.in);
            String rollAgain = rollMore.nextLine();

            if(rollAgain.equalsIgnoreCase("yes")) {
                diceRoller();
            }
        } else {
            System.out.println("That was not a valid input. Try again.");
            diceRoller();
        }
    }


    public static void main(String[] args) {
        System.out.println(adding(2, 5));//7
        System.out.println(subtraction(10, 5));//5
        System.out.println(multiply(10, 5));//50
        System.out.println(divide(10, 2));//5
        System.out.println(remainder(10, 3));//1

        System.out.println(multiplyLoop(100, 2));//20

        System.out.println(getInteger(1, 10));

        factorialValidate();

        diceRoller();


    }
}


