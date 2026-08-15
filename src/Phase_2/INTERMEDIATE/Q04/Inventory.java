package Phase_2.INTERMEDIATE.Q04;

public class Inventory
{
    private int quantity;

    public void setQuantity(int quantity)
    {
        if(quantity >= 0)
        {
            this.quantity = quantity;
        }
    }

    public int getQuantity()
    {
        return this.quantity;
    }
}
