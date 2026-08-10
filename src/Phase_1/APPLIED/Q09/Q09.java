// Show a static variable shared and modified across several objects; print the shared state after each change.
package Phase_1.APPLIED.Q09;

public class Q09
{
    public static void main(String[] args)
    {

        Parent parent = new Parent();
        Parent parent1 = new Parent();
        Parent parent2 = new Parent();

        System.out.println("Initial value :" + parent.age);

        parent1.age = 20;
        System.out.println("Parent1 value :" + parent1.age);

        parent2.age = 30;
        System.out.println("Parent2 value :" + parent2.age);
    }
}
