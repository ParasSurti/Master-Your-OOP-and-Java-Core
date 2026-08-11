package Phase_1.ADVANCED.Q01;

public class Singleton
{
    static Singleton instance;
    private Singleton()
    {

    }
    static Singleton onlyone()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
