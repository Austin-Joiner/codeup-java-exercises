public class HelloWorld {
    public static void main(String[] args) { //renaming main kills the code
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 21;System.out.println(myFavoriteNumber);
        String myString = "My Favorite Number";System.out.println(myString);//doesn't work with char because it's not compatible.
        long myNumber = 123; System.out.print(myNumber); // with the L removed it gives the same result.
        // so it seems only whole numbers are able to be used with long not decimal numbers.
    }
}

