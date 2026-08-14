    //Write a Vehicle class where the constructor chains via this() and a static field tracks total vehicles made.
    package Phase_1.ADVANCED.Q04;

    public class Q04
    {
        public static void main(String[] args)
        {
            Vehicle Mahindra = new Vehicle();
    //        System.out.println("Mahindra " + Vehicle.totalVehicle);
            Vehicle Tata = new Vehicle("Toyota");
    //        System.out.println("Toyota " + Vehicle.totalVehicle);
            Vehicle BMW = new Vehicle("BMW");

            System.out.println(Vehicle.totalVehicle);
        }
    }

