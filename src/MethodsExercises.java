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


    public static void main(String[] args) {
        System.out.println(adding(2, 5));//7
        System.out.println(subtraction(10, 5));//5
        System.out.println(multiply(10, 5));//50
        System.out.println(divide(10, 2));//5
        System.out.println(remainder(10, 3));//1
    }
}
