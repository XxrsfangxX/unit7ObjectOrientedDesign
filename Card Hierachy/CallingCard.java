

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int pin;
    private int cardNumber;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public CallingCard(String n, int pinNumber, int cardNumber)
    {
        // initialise instance variables
        super(n);
        this.pin= pinNumber;
        this.cardNumber= cardNumber;
    }
    public String format()
   {
     return "Card holder: " + this.getName()+  "\n"+ "Pin: "+ pin+"\n"+ " Card Number: "+ cardNumber;
      
   }
   public String toString()
   {
       return "CallingCard[name=" +getName()+"][Card Number =" + cardNumber+"]"+ "[Pin=" + pin+"]";
   }

}
