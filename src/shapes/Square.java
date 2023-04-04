package shapes;

public class Square extends Quadrilateral{

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        int perimeter = 4 * side;
        return perimeter;
    }

    @Override
    public double getArea() {
        int area = side * side;
        return area;
    }


    //    protected int length;
//    protected int width;
//
//    protected Square(int side) {
//        this.length = side;
//        this.width = side;
//    }
//    @Override
//    protected int getArea() {
//        int area = length * width;
//        return area;
//    }
//    @Override
//    protected int getPerimeter() {
//        int perimeter = 2 * length + 2 * width;
//        return perimeter;
//    }
//    public static void main(String[] args) {
//        Square mySquare = new Square(5);
//        System.out.println("area of my Square: " + mySquare.getArea());
//        System.out.println("Perimeter of my Square: " + mySquare.getPerimeter());
//    }
}
