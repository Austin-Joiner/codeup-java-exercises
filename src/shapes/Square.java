package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }
//    protected int length;
//    protected int width;
//
//    protected Square(int side) {
//        this.length = side;
//        this.width = side;
//    }
    @Override
    protected int getArea() {
        int area = length * width;
        return area;
    }
    @Override
    protected int getPerimeter() {
        int area = 2 * length + 2 * width;
        return area;
    }
//    public static void main(String[] args) {
//        Square mySquare = new Square(5);
//        System.out.println("area of my Square: " + mySquare.getArea());
//        System.out.println("Perimeter of my Square: " + mySquare.getPerimeter());
//    }
}
