//Create a class hierarchy where a protected field is accessible in the subclass but not from outside the package.
package Phase_3.APPLIED.Q01.package3;

import Phase_3.APPLIED.Q01.package1.Student1;
import Phase_3.APPLIED.Q01.package2.Student2;

public class Q01
{
    public static void main(String[] args)
    {
        Student1 student1 = new Student1();
        student1.display1();

        Student2 student2 = new Student2();
        student2.display2();

        //Cannot Access it because it is protected
        //System.out.println(Student1.marks);
        //System.out.println(Student2.marks);


    }
}
