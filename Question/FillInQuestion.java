import java.util.Scanner;

/**
 * Write a description of class FillInQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question

{
    
    // override the settExt method to extract the answer from the question text
   /*
    * For expmple, given:
    * "THe inventor of Java was _James Gosling+"
    * text "The inventor of Java was ______"
     answer: "James Gsoling"
      */
    public void setText(String questionText){
    
        Scanner parser= new Scanner(questionText);
        parser.useDelimiter("_");
        String question= parser.next();
        String answer= parser.next();
        question+= "__________" + parser.next();
    
        super.setText(question);
        super.setAnswer(answer);
    }

}
