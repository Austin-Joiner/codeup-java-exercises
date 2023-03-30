package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;



    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Type in a string: ");
        return scanner.nextLine();
    }


   public boolean yesNo() {
       System.out.println("type in 'yes' for true or 'no' for false");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("yes");
    }

    public int[] getInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum integer: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum integer: ");
        int max = scanner.nextInt();

        return new int[] {min, max};
    }

    public int getInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            int input = 0;
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                scanner.nextLine();
            }
            System.out.printf("Invalid input. Please enter an integer between %d and %d.%n", min, max);
        }
    }

    }
