// Write a class where a field is read-only from outside (getter only, no setter).
package Phase_2.FOUNDATIONAL.Q05;

public class Q05
{
    public static void main(String[] args)
    {
        Product product = new Product();
        System.out.println("Minimal Product price Start's from :- " + product.getMinimal_Price());
    }
}
