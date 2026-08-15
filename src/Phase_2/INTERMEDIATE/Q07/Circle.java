package Phase_2.INTERMEDIATE.Q07;

public class Circle
{
    private double radius;
    private double area;

    public void setRadius(double radius)
    {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
    public double getArea()
    {
        return this.area;
    }
    public String getStringFormat(double area)
    {
        return String.format("%.2f",area);
    }
}
