package Phase_1.APPLIED.Q08;


public class Parent
{
    void show()
    {
        System.out.println("its a parent class");
    }
}
class child extends Parent
{
    @Override
    void show()
    {
        System.out.println("its a child class");
    }
}

