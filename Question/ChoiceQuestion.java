
/**
 * Write a description of class MultipleChoiceQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChoiceQuestion extends Question 
{
    private int numberOfChoices;

   
    public ChoiceQuestion(){
        super();
        this.numberOfChoices=0;
      }

    
    public void addChoice(String choice, boolean correct){
        numberOfChoices++;
        this.addText("\n" + numberOfChoices+ ")"+  choice);

        if(correct){
            String choiceString= ""+ numberOfChoices;
            this.setAnswer(choiceString);
        }

    }

}
