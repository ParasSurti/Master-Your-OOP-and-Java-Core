package Phase_2.INTERMEDIATE.Q06;

public class Percentage
{
     private float percentage;

     public void setPercentage(float percentage)
     {
         if(percentage > 100)
         {
             this.percentage = 100f;
         }
         else if(percentage < 0)
         {
             this.percentage = 0;
         }
         else
             this.percentage = percentage;
     }

     public float getPercentage()
     {
         return this.percentage;
     }
}
