//Compare a class with no constructor (implicit default) against one with an explicit constructor.
package Phase_1.Foundation.Q06;

public class Q06
{
    public static void main(String[] args)
    {
        Explicit explicit = new Explicit();
        System.out.println(explicit.age);
    }
}
