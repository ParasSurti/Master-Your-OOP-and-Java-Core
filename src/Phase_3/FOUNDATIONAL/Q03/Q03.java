// Demonstrate that a subclass automatically gets all non-private members of its parent
package Phase_3.FOUNDATIONAL.Q03;

public class Q03
{
    public static void main(String[] args)
    {
        Child child = new Child();
        System.out.println(child.name);
    }
}
