// Create a class where changing one field through its setter also updates a dependent private field (e.g., changing radius updates a cached area).
package Phase_2.INTERMEDIATE.Q07;

public class Q07
{
    public static void main(String[] args)
    {
        Circle area = new Circle();
        area.setRadius(5);
        System.out.println(area.getStringFormat(area.getArea()));
    }
}
