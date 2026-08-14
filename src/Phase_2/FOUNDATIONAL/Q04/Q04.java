//Create a class Product with a private price field and a getter that formats the price with 2 decimals.
package Phase_2.FOUNDATIONAL.Q04;

public class Q04
{
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setPrice(9.5);
        System.out.println(product.getFormatted());

    }
}
