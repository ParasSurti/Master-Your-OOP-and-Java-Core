// Build a class Percentage whose setter clamps any value outside 0–100 to the nearest boundary.
package Phase_2.INTERMEDIATE.Q06;

public class Q06
{
    public static void main(String[] args)
    {
        Percentage percent = new Percentage();
        percent.setPercentage(190.2f);
        System.out.println(percent.getPercentage());

        Percentage percent1 = new Percentage();
        percent1.setPercentage(-120.23f);
        System.out.println(percent1.getPercentage());

        Percentage percent2 = new Percentage();
        percent2.setPercentage(66.32f);
        System.out.println(percent2.getPercentage());
    }
}
