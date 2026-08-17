// Create an immutable class Point (final fields, no setters, all values set via constructor).
package Phase_2.APPLIED.Q01;

public class Q01
{
    public static void main(String[] args) {
        Point point = new Point(2, 32);
        System.out.println(point.x);
        System.out.println(point.y);
    }
}
