public class ControlFlowExercises {
    public static void main(String[] args) {

        //1. Loop Basics
        //1.a While
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


        //
        //1.b Do While question 1
//        int i = 0;
//
//        do {
//            System.out.println(i);
//           i = i + 2;
//
//
//        } while (i <= 100); {
//
//        }

        //1.b question 2
//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i = i - 5;
//
//
//        } while (i >= -10); {
//
//        }

        //1.b question 3
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i = i * i;
//
//        } while (i < 1000000); {
//
//        }

        //c question 1
        //1.a refactored into a for loop
//
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//
//        }

        //
        //c question 2
        //1.b refactored question 1

//         for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//         }

        //
        //c question 3
        //1.b refactored question 2
//        int i = 100;
//            for (int i = 100; i >= -10; i -= 5) {
//                System.out.println(i);
//            }
//
        //
        //c question 3
        //1.b refactored question 3
//        long i = 2;
        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }


    }
}
