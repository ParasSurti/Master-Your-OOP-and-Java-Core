//Add a setter for age that rejects negative values and keeps the old value instead.
package Phase_2.FOUNDATIONAL.Q03;

public class Q03
{
    public static void main(String[] args)
    {
        Age age1 = new Age();
        age1.setAge(-25);
        System.out.println(age1.getAge());

        age1.setAge(5);
        System.out.println(age1.getAge());
    }
}
