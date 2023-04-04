package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = width * length;
        return area;
    }

    // these create the actual integers we change later.
//    protected int length;
//    protected int width;


//    protected Rectangle(int length, int width) {
//        // this is the constructor, we use this to target the class with this and the integers we made for our obj properties.
//        this.length = length;
//        this.width = width;
//    }
//    protected int getArea() { // this is area formula we will run the numbers through at the end
//        int area = width * length;
//        return area;
//    }
//    protected int getPerimeter() {// this is perimeters formula we will run the numbers through at the end
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }
//    public static void main(String[] args) {
//        Rectangle myRectangle = new Rectangle(5,10); //this creates the obj 'myRectangle' and makes the properties 5 and 10
//
//        System.out.println("Area: " + myRectangle.getArea()); // outputs getArea using its return and running my new obj properties through it
//        System.out.println("Perimeter: " + myRectangle.getPerimeter()); //outputs getPerimeter using its return and running my new obj properties through it
//    }



}
