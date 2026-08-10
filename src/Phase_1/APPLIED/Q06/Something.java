package Phase_1.APPLIED.Q06;

public class Something
{
    int value = 5;
    static void show(Something obj)
    {
        System.out.println(obj.value);
        System.out.println("This block has run");
    }


    //We cannot access an instance variable from a static method
    //Fix 1 : both static
    //Fix 2 : Pass the specific object in as a parameter, so the static method knows exactly which object's instance data to access.
    //        (create a space for it in parameter to know which object to look at)
}
