// Write a class where a field is write-only from outside (setter only, no getter) and explain a real use case.
package Phase_2.FOUNDATIONAL.Q06;

public class Q06
{
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setTransaction(13000);

        //can be used in transaction when a transaction is made (set) is can't be changed unless inside the log
    }
}
