//Create a class Counter with a static variable that tracks how many objects have been created.
package Phase_1.APPLIED.Q01;

public class Q01
{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();

        System.out.println(counter1.num);
    }
}
