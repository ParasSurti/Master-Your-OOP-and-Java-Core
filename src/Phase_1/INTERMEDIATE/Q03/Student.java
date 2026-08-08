package Phase_1.INTERMEDIATE.Q03;

public class Student
{
    int age = 10;
    void student2(Student a)
    {
        System.out.println(a.age);
    }
    void trigger()
    {
        student2(this);
    }
}


