// Create a class Student with private name and marks fields, exposed only through getters/setters.
package Phase_2.FOUNDATIONAL.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Paras");
        s1.setMarks(7.8f);

        Student s2 = new Student();
        s2.setName("Pranay");
        s2.setMarks(7.5f);


        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        System.out.println(s2.getName());
        System.out.println(s2.getMarks());
    }
}

