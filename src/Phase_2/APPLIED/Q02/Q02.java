// Create Immutable Class Money with private final fields and a method that returns new Money instead of mutating.
package Phase_2.APPLIED.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Money money1 = new Money(100);
        Money money2 = money1.add(50);

        System.out.println(money1.getMoney());
        System.out.println(money2.getMoney());

    }
}
