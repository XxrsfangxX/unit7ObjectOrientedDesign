

/**
 * Write a description of class BillfoldTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillfoldTester
{
      
        public static void main(String [] args){
            Billfold bill= new Billfold();
            Card card1= new Card();
            Card card2= new IDCard("Bob", "12345");
            bill.addCard(card1);
            bill.addCard(card2);
            System.out.println(bill.formatCards());
        }
        public static void getExpiredCountTest()
        {
            Billfold bill= new Billfold();
            Card card1= new CallingCard("Stevan",15,5567);
            Card card2= new DriverLicense("Bob", 2015);
            bill.addCard(card1);
            bill.addCard(card2);
            System.out.println(bill.getExpiredCardCount());
        }
    }


