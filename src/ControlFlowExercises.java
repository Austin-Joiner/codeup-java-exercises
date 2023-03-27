import java.util.Scanner;

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
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }



        //
        //
        //
        //


//        Question 2

//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("fizzBuzz: " + i);
//                continue;
//            }
//            if (i %  3 == 0) {
//                System.out.println("Fizz: " + i);
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz: " + i);
//            }
//        }


        //question 3

//        Scanner word = new Scanner(System.in);
//
//        System.out.println("Do you want to use the table chart? Y for yes, N for No");
//
//
//        String userChoice = word.next();
//
//
//        if ((userChoice.toUpperCase().equals("Y"))) {
//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter in a Number: ");
//            int userInput = input.nextInt();
//
//            System.out.println("Here is Your Table for The Number: " + userInput);
//
//            System.out.println("number  |  squared  |  cubed");
//            System.out.println("------  |  -------  |  -----");
//
//            for (long i = 1; i <= userInput; i++) {
//                long square = (long) Math.pow(i, 2);
//                long cubed = (long) Math.pow(i, 3);
//                System.out.println(i + "        |  " + square + "         |  " + cubed);
//            }
//
//            } else if (userChoice.toUpperCase().equals("N")) {
//                System.out.println("OK. Maybe Later Then.");
//            } else {
//                System.out.println("Error Invalid Input");
//            }


            //Question 4
        Scanner word = new Scanner(System.in);

        String continueGrade;

        do {
            System.out.println("Do you want Enter in a grade? Y for yes, N for No");
            continueGrade = word.next();


            if(continueGrade.toUpperCase().equals("Y")) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter in a grade from 0-100: ");
                int userInput = input.nextInt();


                if (userInput < 50 && userInput >= 0) {
                    System.out.println("F-");
                } else if (userInput < 54 && userInput >= 0) {
                    System.out.println("F");
                } else if (userInput < 60 && userInput >= 0) {
                    System.out.println("F+");
                } else if (userInput < 63 && userInput >= 0) {
                    System.out.println("D-");
                } else if (userInput < 64 && userInput >= 0) {
                    System.out.println("D");
                } else if (userInput < 67 && userInput >= 0) {
                    System.out.println("D+");
                } else if (userInput < 69 && userInput >= 0) {
                    System.out.println("C-");
                } else if (userInput < 77 && userInput >= 0) {
                    System.out.println("C");
                } else if (userInput < 80 && userInput >= 0) {
                    System.out.println("C+");
                } else if (userInput < 82 && userInput >= 0) {
                    System.out.println("B-");
                } else if (userInput < 85 && userInput >= 0) {
                    System.out.println("B");
                } else if (userInput < 88 && userInput >= 0) {
                    System.out.println("B+");
                } else if (userInput < 92 && userInput >= 0) {
                    System.out.println("A-");
                } else if (userInput < 97 && userInput >= 0) {
                    System.out.println("A");
                } else if (userInput <= 100 && userInput >= 0) {
                    System.out.println("A+");
                } else {
                    System.out.println("Error Invalid Input");
                }
            }
            if (continueGrade.toUpperCase().equals("N")) {
                System.out.println("Ok maybe later");
            } else if (continueGrade.toUpperCase().equals("Y")) {
                System.out.println("That is Your Grade");
            } else {
                System.out.println("Error Invalid Input");
            }
        } while (continueGrade.toUpperCase().equals("Y"));





        }
    }

