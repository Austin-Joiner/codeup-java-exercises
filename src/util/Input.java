package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;



    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }
//    boolean yesNo() {
//        return scanner.nextLine();
//        if(testtt.equals("yes")) {
//            System.out.println("true");
//        } else if (testtt.equals("no")) {
//            System.out.println("false");
//        } else {
//            System.out.println("Invalid input try again");
//        }
//    }
    int getInt(int min, int max) {
        int inputs;
        do {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("invlaid Response. Try again.");
                scanner.next();
            }
            inputs = scanner.nextInt();
            scanner.nextLine();
        }while (inputs < min || inputs > max);
        return inputs;
    }
    int getInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
    double getDouble(double min, double max) {
        double input;
        do {
            System.out.printf("Enter a double between %f and %f: ", min, max);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a double.");
                scanner.next();
            }
            input = scanner.nextDouble();
            scanner.nextLine();
        } while (input < min || input > max);
        return input;
    }
    double getDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a double.");
            scanner.next();
        }
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }
}
