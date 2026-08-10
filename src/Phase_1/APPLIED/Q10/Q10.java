//Write a program that assigns each new object a unique auto-incrementing ID using a static counter.
package Phase_1.APPLIED.Q10;

public class Q10
{
    public static void main(String[] args)
    {
        Increment increment = new Increment();
        System.out.println("Object 1 ID : " + increment.id);
        Increment increment1 = new Increment();
        System.out.println("Object 2 ID : " + increment1.id);
        Increment increment2 = new Increment();
        System.out.println("Object 3 ID : " + increment2.id);
    }
}
