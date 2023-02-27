public class HelloWorld {
    public static void main(String[] args) { //renaming main kills the code
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 21;System.out.println(myFavoriteNumber);
        String myString = "My Favorite Number";System.out.println(myString);//doesn't work with char because it's not compatible.
        double myNumber = 3.14; // 2 ways to fix this is 1. double instead of float as the data type or 2. (float) before the value.
        System.out.println(myNumber);


        int x = 5;
        System.out.println(x++);// this is 5 incrementing 1 to is but after the print
        System.out.println(x);// so since the line above happens and increment and stays at 5 this line is 6 because 5 + 1 = 6.
    }
}

