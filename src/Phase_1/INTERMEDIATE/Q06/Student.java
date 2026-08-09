package Phase_1.INTERMEDIATE.Q06;

public class Student
{
    Student Method1()
    {
        System.out.println("Method 1 is Called");
        return this;
    }
    void trigger()
    {
       this.Method1();
    }
}
