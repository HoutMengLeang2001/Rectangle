// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("Area "+rectangle.getArea());
        System.out.println("perimeter "+rectangle.getPerimeter());
        Square square = new Square(3);
        System.out.println("Square Area "+square.getArea());
    }
}