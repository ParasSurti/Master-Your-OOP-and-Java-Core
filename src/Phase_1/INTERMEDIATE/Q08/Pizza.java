package Phase_1.INTERMEDIATE.Q08;

public class Pizza
{
    String topping ;
    String size;
    Pizza addTopping(String topping)
    {
        this.topping = topping;
        return this;
    }
    Pizza Size(String size)
    {
        this.size = size;
        return this;
    }
}
