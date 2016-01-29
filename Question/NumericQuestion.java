

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private double answer;
    /**
     * Default constructor for objects of class NumericQuestion
     */
    public NumericQuestion()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void setAnswer(double correctResponse)
    {
        this.answer= correctResponse;
    }
    
    public boolean checkAnswer(String response){
         double responseAsDouble= Double.parseDouble(response);
         return Math.abs(responseAsDouble-answer)<= 0.01;
        
    }

  

}
