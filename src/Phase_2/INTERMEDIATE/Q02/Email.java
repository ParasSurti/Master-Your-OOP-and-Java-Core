package Phase_2.INTERMEDIATE.Q02;

public class Email
{
    private String email;

    public void setEmail(String email)
    {
        if(email.contains("@"))
        {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }
}
