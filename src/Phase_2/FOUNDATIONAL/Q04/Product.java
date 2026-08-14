package Phase_2.FOUNDATIONAL.Q04;

public class Product
{
    private double price ;

    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getFormatted()
    {
        return String.format("%.2f",price);
    }

}
