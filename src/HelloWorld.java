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

        //int x = 5;//this increments before the print
        //System.out.println(++x);// now this increments before so instead of 5 it already adds 1 so its 6
        //System.out.println(x);// since the above line is already 6 this jst calls on x new vale again which is still 6

        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;// sends error but allows other outputs.(Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer)
        //System.out.println(three);

        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) "three";
        //System.out.println(three);// still sends an error but doesnt let anything else output (incompatible types: java.lang.String cannot be converted to int)



//        int x = 4;
//        x = x + 5;
        //int x = 4; // x = 4
       //x += 5; // 5 + 4 = 9
        //System.out.println(x);

        //int x = 3;
        //int y = 4;
        //y = y * x;

        //int x = 3;
        //int y = 4;
        //y *= x; // shorthand of y = y * x
        //System.out.println(y);


        //int x = 10;
        //int y = 2;
        //x = x / y;
        //y = y - x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);


// if the number is bigger or smaller than the data type it will have an error.

        short shortMax = Short.MAX_VALUE; //32767
        //short shortNum = 32768; // error
        //short shortNum = -32769;// error

        System.out.println(shortNum);
        System.out.println(shortMax);

        int numMax = Integer.MAX_VALUE;// max is 2147483647
        //int numVar = 2147483648 // error number too large.
        int numMin = Integer.MIN_VALUE;// min is -2147483648
        //int numVar = -2147483649; // number too large

        System.out.println(numMax);
        System.out.println(numMin);
        //System.out.println(numVar);
    }
}

