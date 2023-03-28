import java.util.Scanner;

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


    public static void main(String[] args) {
        System.out.println(adding(2, 5));//7
        System.out.println(subtraction(10, 5));//5
        System.out.println(multiply(10, 5));//50
        System.out.println(divide(10, 2));//5
        System.out.println(remainder(10, 3));//1

        System.out.println(multiplyLoop(100, 2));//20

        System.out.println(getInteger(1, 15));
    }
}
