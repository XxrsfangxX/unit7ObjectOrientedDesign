 
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
       GregorianCalendar calendar = new GregorianCalendar();
       if (calendar.get(GregorianCalendar.YEAR) > year)
       {
           return true;
       }
       else 
       {
           return false;
       }
   }
   
   public String toString()
   {
       return "DriversLicense[name=" +getName()+"][Expiration Year =" + year+"]";
   }
   
   public int getExpirationYear()
   {
      return year;
   }
    public boolean equals(DriverLicense card1){
       
       if(super.equals(card1)&& year == card1.year){
           return true;
           
        }
       else{
           return false;
        }
           
    }
}
