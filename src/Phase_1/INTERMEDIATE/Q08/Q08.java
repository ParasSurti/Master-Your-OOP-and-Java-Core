//Build a class Pizza where addTopping(), setSize(), etc. each return this to allow chained calls.
package Phase_1.INTERMEDIATE.Q08;

public class Q08
{
    public static void main(String[] args)
    {
        Pizza pizza = new Pizza();
        pizza.addTopping("Cheese").Size("Large");
        System.out.println(pizza.topping + ", " + pizza.size);
    }
}
