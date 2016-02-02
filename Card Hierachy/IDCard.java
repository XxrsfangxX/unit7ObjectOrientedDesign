

/**
 * Write a description of class IdCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;
    
    public IDCard(String n, String id){
        super(n);
        idNumber= id;
    }
    
    public String format()
   {
     return "Card holder: " + this.getName()+ "\n"+ "ID number "+ idNumber;
      
   }
   
   public String toString()
   {
       return "IDCard[name=" +getName()+"][ID number =" + idNumber+"]";
   }
}
