//Build a class UserAccount that keeps the password field encapsulated and never exposes it via a getter or toString().
package Phase_2.APPLIED.Q04;

public class Q04
{
    public static void main(String[] args)
    {
        UserAccount account = new UserAccount("paras","paras123");
        System.out.println(account);
    }
}
