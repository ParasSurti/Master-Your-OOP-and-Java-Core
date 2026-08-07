// Create a parameterized constructor for Student that accepts name and age.
package Phase_1.Foundation.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Student constructor = new Student(21,"Paras");
        System.out.println(constructor.age);
        System.out.println(constructor.name);
    }
}
