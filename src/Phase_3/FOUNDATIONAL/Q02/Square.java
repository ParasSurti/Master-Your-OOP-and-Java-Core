package Phase_3.FOUNDATIONAL.Q02;

public class Square extends Shape
{
    private double side;

    Square(double side)
    {
        this.side = side;
    }

    @Override
    public double area()
    {
        return Math.pow(side,2);
    }
}
