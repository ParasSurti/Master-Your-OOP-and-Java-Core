//Create a class Inventory whose setQuantity() cannot go below zero.
package Phase_2.INTERMEDIATE.Q04;

public class Q04
{
    public static void main(String[] args)
    {
        Inventory vehicleInventory = new Inventory();
        vehicleInventory.setQuantity(-1);
        System.out.println(vehicleInventory.getQuantity());


        Inventory clothesInventory = new Inventory();
        clothesInventory.setQuantity(5);
        System.out.println(clothesInventory.getQuantity());
    }
}
