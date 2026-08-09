package Phase_1.INTERMEDIATE.Q07;

public class Student
{

    int age; //age --> field

    Student(int age)// age --> parameter
    {
//        age = age; //buggy: only reassigns the parameter, field stays untouched
        this.age = age; // touches the (field) age and (parameter) age
    }
}
