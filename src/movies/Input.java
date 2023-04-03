package movies;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        System.out.print("Press Enter your Preference: ");
        while (scanner.hasNextInt()) {
            scanner.next();
        }
        int intValue = scanner.nextInt();
        scanner.nextLine();
        return intValue;
    }



    public static void closeScanner() {
        scanner.close();
    }
}

