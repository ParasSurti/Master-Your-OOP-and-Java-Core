package Phase_2.APPLIED.Q02;

public class Money
{
    private final double money;

    Money(double money)
    {
        this.money = money;
    }
    public Money add(double extra)
    {
        return new Money(this.money + extra);
    }

    public double getMoney()
    {
        return this.money;
    }
}
