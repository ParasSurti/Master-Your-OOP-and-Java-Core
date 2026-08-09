//Demonstrate a bug caused by omitting this (variable shadowing), then fix it.
package Phase_1.INTERMEDIATE.Q07;

public class Q07
{
    public static void main(String[] args)
    {
        Student student = new Student(21);
        System.out.print(student.age);
    }
}