package Phase_1.ADVANCED.Q02;

public class NewId
{
    static int counter = 0;
    int id;
    NewId()
    {
        counter++;
        id = counter;
    }
    NewId showId()
    {
        System.out.println("ID : " + id);
        return this;
    }
}
