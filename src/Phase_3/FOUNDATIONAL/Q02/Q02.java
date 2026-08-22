//Create a class Shape with area() = 0, and subclasses Circle and Square that use inherited fields.
package Phase_3.FOUNDATIONAL.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3);
        System.out.println("Area of Circle : " + circle.area());

        Square square = new Square(3);
        System.out.println("Area of Square : " + square.area());

    }
}
