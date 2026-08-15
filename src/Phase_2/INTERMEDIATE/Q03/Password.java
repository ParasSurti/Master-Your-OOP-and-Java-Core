package Phase_2.INTERMEDIATE.Q03;

public class Password
{
    private String password;

    public void setPassword(String password)
    {
        if(password.length() >= 8)
        {
            this.password = password;
        }
    }

    public String getPassword()
    {
        return this.password;
    }
}
