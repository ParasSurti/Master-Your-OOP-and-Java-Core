package Phase_2.APPLIED.Q04;

public class UserAccount
{
    private String userName;
    private String password;

    UserAccount(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "Username { username = ' " + userName + " ' }";
    }
}
