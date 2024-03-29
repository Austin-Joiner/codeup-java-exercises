package shapes;
import shapes.Rectangle;
import shapes.Square;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5,10);
        System.out.println("Area of my rectangle: " + myRectangle.getArea());
        System.out.println("Perimeter of my rectangle: " + myRectangle.getPerimeter() + "\n");

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Area of my rectangle(box1): " + box1.getArea());
        System.out.println("Perimeter of my rectangle(box1): " + box1.getPerimeter());

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

        Square box2 = new Square(5);
        System.out.println("Area of my Square(box2): " + box2.getArea());
        System.out.println("Perimeter of my Square(box2): " + box2.getPerimeter());


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Below is measurable/ interface and abstracts");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\n");

        Measurable myShape = new Rectangle(5, 10);
        System.out.println("Area of myShape rectangle is: " + myShape.getArea());
        System.out.println("Perimeter of myShape rectangle is: " + myShape.getPerimeter());

        myShape = new Square(10);
        System.out.println("Area of myShape square is: " + myShape.getArea());
        System.out.println("Perimeter of myShape square is: " + myShape.getPerimeter());




//        Square mySquare = new Square(5);
//        System.out.println("Area of my Square: " + mySquare.getArea());
//        System.out.println("Perimeter of my Square: " + mySquare.getPerimeter());
    }

}
