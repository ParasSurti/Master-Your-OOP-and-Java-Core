//Create a class Email that validates the format inside the setter before assigning.
package Phase_2.INTERMEDIATE.Q02;

public class Q02
{
    public static void main(String[] args)
    {
        Email email = new Email();
        email.setEmail("paras@gmail.com");
        System.out.println(email.getEmail());
    }
}
