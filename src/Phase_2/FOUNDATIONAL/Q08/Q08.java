//Demonstrate the difference in behavior between a public field and a private field with getter/setter, after adding validation.
package Phase_2.FOUNDATIONAL.Q08;

public class Q08
{
    public static void main(String[] args)
    {
        Product product1 = new Product();
        product1.setQuantity(-2);
        System.out.println(product1.getQuantity());

        Product product2 = new Product();
        product2.outOfStock = -10;
        System.out.println(product2.outOfStock);
    }
}
