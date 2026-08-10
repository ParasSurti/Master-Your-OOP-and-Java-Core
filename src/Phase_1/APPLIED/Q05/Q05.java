//Write a class with a static nested class, and access it from main.
package Phase_1.APPLIED.Q05;

public class Q05
{
    public static void main(String[] args)
    {
        Number.Inner obj = new Number.Inner();
        System.out.println(obj.inner);
    }
}
