package Phase_2.FOUNDATIONAL.Q08;

public class Product
{
    private int quantity;
    public int outOfStock;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        if(quantity >= 0)
        {
            this.quantity = quantity;
        }
    }

}
