

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold
{
    private Card card1;
    private Card card2;
    
    public void addCard(Card card){
        if( this.card1 ==null){
            card1 = card;
        }
        else if(card2== null){
             card2 = card;
        }
        
    }
    
    public String formatCards(){
        return card1.format()+ card2.format();
    }
}
