public class HelloWorld {
    public static void main(String[] args) { //renaming main kills the code
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 21;System.out.println(myFavoriteNumber);
        String myString = "My Favorite Number";System.out.println(myString);//doesn't work with char because it's not compatible.
        float myNumber = (float) 3.14; // 2 ways to fix this is 1. double instead of float as the data type or 2. (float) before the value.
        System.out.print(myNumber);
    }
}

