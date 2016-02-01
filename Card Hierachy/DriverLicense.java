 
import java.util.GregorianCalendar;

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int year;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, int expirationYear)
    {
        // initialise instance variables
        super(n);
        this.year= expirationYear;
    }
    
    public String format()
   {
     return "Card holder: " + this.getName()+ "\n"+ "Expiration Date "+ year;
      
   }
   
   public boolean isExpired()
   {

       if (calender.get(Calander.YEAR) > year)
       {
           return true;
       }
       else 
       {
           return false;
       }
   }

}
