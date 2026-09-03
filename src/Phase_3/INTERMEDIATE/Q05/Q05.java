//Demonstrate that the parent constructor always runs before the child constructor, even without an explicit super() call.
package Phase_3.INTERMEDIATE.Q05;

public class Q05
{
    public static void main(String[] args)
    {
        Child child = new Child();
    }
}
