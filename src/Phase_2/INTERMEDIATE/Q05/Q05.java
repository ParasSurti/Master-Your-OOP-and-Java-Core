// Design a class DateOfBirth whose setter rejects future dates.
package Phase_2.INTERMEDIATE.Q05;

import java.time.LocalDate;

public class Q05
{
    public static void main(String[] args)
    {
        DateofBirth person = new DateofBirth();
        LocalDate dob = LocalDate.of(2038,2,12);
        person.setDate(dob);
        System.out.println(person.getDate());

        DateofBirth person2 = new DateofBirth();
        LocalDate person2_dob = LocalDate.of(2008,2,12);
        person2.setDate(person2_dob);
        System.out.println(person2.getDate());
    }
}
