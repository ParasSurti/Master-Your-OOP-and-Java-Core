// Create a class Employee whose setSalary() rejects any value below a minimum wage.
package Phase_2.INTERMEDIATE.Q01;

public class Q01
{
    public static void main(String[] args)
    {
        Employee person1 = new Employee();
        person1.setSalary(15000.35);
        System.out.println(person1.getSalary());

        Employee person2 = new Employee();
        person1.setSalary(35000.24);
        System.out.println(person1.getSalary());
    }
}
