//Create a class Temperature that stores Celsius internally but exposes getFahrenheit() as a derived getter.
package Phase_2.FOUNDATIONAL.Q07;

public class Q07
{
    public static void main(String[] args)
    {
        Temperature temp = new Temperature();
        temp.setCelsius(100);
        System.out.println("Celsius --> Fahrenheit" +"\n" + temp.getFahrenheit());
    }
}
