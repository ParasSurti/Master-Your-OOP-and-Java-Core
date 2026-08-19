package Phase_2.APPLIED.Q03;

public class Car
{
    private boolean isRunning;

    public String start()
    {
        if(isRunning)
        {
            return "Car is already Running!";
        }
        isRunning = true;
        return "Car is Started !!!";
    }
    public String stop()
    {
        if(!isRunning)
        {
            return "Car has already Stopped !!";
        }
        isRunning = false;
        return "Car has been stopped !!!";
    }
}
