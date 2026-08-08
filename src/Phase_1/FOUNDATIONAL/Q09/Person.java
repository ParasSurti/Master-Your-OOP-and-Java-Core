package Phase_1.Foundation.Q09;

public class Person
{
    int age;
    Person(int age)
    {
        if(age < 0)
        {
            this.age = 0;
        }
        else
        {
            this.age = age;
        }
    }
}
