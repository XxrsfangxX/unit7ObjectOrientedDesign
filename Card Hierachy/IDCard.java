

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
   
   public boolean equals(Object other){
       
       // Check if this object and the other object are both instances of the same class
       
       if(this.getClass()== other.getClass()){
           IDCard otherIdCard= (IDCard) other;
           
           boolean isEqual= super.equals(other);
           return isEqual&& idNumber.equals(otherIdCard.idNumber);
        }
        else{
            return false;
        }
    
    }
}
