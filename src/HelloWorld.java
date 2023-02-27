public class HelloWorld {
    public static void main(String[] args) { //renaming main kills the code
        System.out.print("Hello, ");
        System.out.println("World!");
        int myFavoriteNumber = 21;System.out.println(myFavoriteNumber);
        String myString = "My Favorite Number";System.out.println(myString);//doesn't work with char because it's not compatible.

        double myNumber = 3.14; // 2 ways to fix this is 1. double instead of float as the data type or 2. (float) before the value.
        float newTest = (float) myNumber;// this is another way of doing it
        System.out.println(newTest);
        System.out.println(myNumber);


        //int x = 5;// this increments after the print
        //System.out.println(x++);// this is 5 incrementing 1 to is but after the print
        //System.out.println(x);// so since the line above happens and increment and stays at 5 this line is 6 because 5 + 1 = 6.

        int x = 5;//this increments before the print
        System.out.println(++x);// now this increments before so instead of 5 it already adds 1 so its 6
        System.out.println(x);// since the above line is already 6 this jst calls on x new vale again which is still 6

        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;// sends error but allows other outputs.
        //System.out.println(three);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) "three";
        System.out.println(three);// still sends an error but doesnt let anything else output
    }
}

