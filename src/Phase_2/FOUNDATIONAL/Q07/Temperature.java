package Phase_2.FOUNDATIONAL.Q07;

public class Temperature
{
    private double celsius;

    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }
    public String getFahrenheit()
    {
        return String.format("%.2f",((celsius * 9)/5) + 32);
    }
}
