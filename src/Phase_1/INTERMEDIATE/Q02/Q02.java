//Use this() to call one constructor from another (constructor chaining) in a class Product.
package Phase_1.INTERMEDIATE.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Product product = new Product();
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
