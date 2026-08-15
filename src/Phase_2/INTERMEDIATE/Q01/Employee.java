package Phase_2.INTERMEDIATE.Q01;

public class Employee
{
    private double salary;

    public void setSalary(double salary)
    {
        if(salary >= 30000)
        {
            this.salary = salary;
        }
    }

    public double getSalary()
    {
        return salary;
    }
}
