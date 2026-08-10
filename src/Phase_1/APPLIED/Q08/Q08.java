// Demonstrate static method hiding vs instance method overriding using a Parent/Child pair
package Phase_1.APPLIED.Q08;

public class Q08
{
    public static void main(String[] args)
    {
        Parent parent = new child();
        parent.show();
    }
}
