//Create a subclass that adds a new method not present in the parent, and call it only on the subclass object.
package Phase_3.FOUNDATIONAL.Q06;

public class Q06
{
    public static void main(String[] args)
    {
//        Parent parent = new Parent();
//        System.out.println(parent.getMethod());
        //Error :- java: cannot find symbol

        Child child = new Child();
        System.out.println(child.getMethod());
    }
}
