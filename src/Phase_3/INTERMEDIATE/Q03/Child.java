package Phase_3.INTERMEDIATE.Q03;

public class Child extends Parent
{
    String name = "Child";
    void show()
    {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
