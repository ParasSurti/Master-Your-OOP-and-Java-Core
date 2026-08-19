//Design a class Car that fully hides its internal fields and exposes only behavior methods (start(), stop()) — no getters/setters at all.
package Phase_2.APPLIED.Q03;

public class Q03
{
    public static void main(String[] args)
    {
        Car car = new Car();
        System.out.println(car.start());
        System.out.println(car.start());
        System.out.println(car.stop());
        System.out.println(car.stop());
    }
}
