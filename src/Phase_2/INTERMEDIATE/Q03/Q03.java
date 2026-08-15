//Build a class Password whose setter enforces a minimum length rule.
package Phase_2.INTERMEDIATE.Q03;

public class Q03
{
    public static void main(String[] args)
    {
        Password userName1 = new Password();
        userName1.setPassword("abc");
        System.out.println(userName1.getPassword());


        Password userName2 = new Password();
        userName2.setPassword("I-am-Mastering-OOP");
        System.out.println(userName2.getPassword());
    }
}
