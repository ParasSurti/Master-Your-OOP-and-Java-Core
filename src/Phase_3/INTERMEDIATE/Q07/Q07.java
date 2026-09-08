//Show a case where forgetting super() with a parameterized-only parent constructor causes a compile error, then fix it.
package Phase_3.INTERMEDIATE.Q07;

public class Q07
{
    public static void main(String[] args)
    {
        Child child = new Child();
    }
}
