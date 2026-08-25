//Show that a private field of the parent is not directly accessible in the child class.
package Phase_3.FOUNDATIONAL.Q05;

public class Q05
{
    public static void main(String[] args)
    {
        Child child = new Child();
        //cannot directly access the private parent class field
//        System.out.println(child.motherName);
        //error : motherName has private class

        //create a public instance(object) of it
        System.out.println(child.getMotherName());
    }
}
