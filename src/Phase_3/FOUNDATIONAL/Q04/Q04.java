//Create a 3-level inheritance chain: Vehicle fi Car fi SportsCar.
package Phase_3.FOUNDATIONAL.Q04;

public class Q04
{
    public static void main(String[] args)
    {
        SportsCar new_sportsCar = new SportsCar();
        System.out.println(new_sportsCar.name);        // <-- from Vehicle, TWO levels up
        System.out.println(new_sportsCar.car_type);     // <-- also from Vehicle, TWO levels up
        System.out.println(new_sportsCar.sportCar_name); // <-- from Car, ONE level up (what you already tested)
    }
}
