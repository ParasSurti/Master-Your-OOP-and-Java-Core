package Phase_2.INTERMEDIATE.Q05;

import java.time.LocalDate;

public class DateofBirth
{
    private LocalDate date;

    public void setDate(LocalDate date)
    {
        if(date.isBefore(LocalDate.now()))
        {
           this.date = date;
        }
    }
    public LocalDate getDate()
    {
        return this.date;
    }
}
