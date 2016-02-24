import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
public class ControlPanel extends JPanel
{
    // Instance variables
    private JButton pickColorButton;
     private JButton addCircleButton;
     private JButton addSquareButton;
     private JPanel currentColor;
     private Color drawingColor;
    
    public ControlPanel(DrawingPanel canvas){
        //Initializes all the buttons and objects in the south layer.
        this.pickColorButton= new JButton("Pick Color");
        this.currentColor= new JPanel();
        this.addCircleButton= new JButton("Add Circle");
        this.addSquareButton=new JButton("Add Square");
        drawingColor= canvas.getColor();
        currentColor.setBackground(drawingColor);
     
        //Adds the buttons to the panel. 
        this.add(this.pickColorButton);
        this.add(this.currentColor);
        this.add(this.addCircleButton);
        this.add(this.addSquareButton);
        
    }
    public class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
           
            if(event.getActionCommand.equals("Pick Color")){
                
            }
            
       
        
        }
        }
     
}
