import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics2D;

public class ControlPanel extends JPanel
{
    // Instance variables
     private JButton pickColorButton;
     private JButton addCircleButton;
     private JButton addSquareButton;
     private JPanel currentColor;
     private Color drawingColor;
     private DrawingPanel canvas;
     private Graphics2D g;
     
    
    public ControlPanel(DrawingPanel canvas){
        //Initializes all the buttons and objects in the south layer.
        this.canvas= canvas;
        this.pickColorButton= new JButton("Pick Color");
        ButtonListener pickColorListener= new ButtonListener();
        this.pickColorButton.addActionListener(pickColorListener);
        this.currentColor= new JPanel();
        this.addCircleButton= new JButton("Add Circle");
        ButtonListener addCircleListener= new ButtonListener();
        this.addCircleButton.addActionListener(addCircleListener);
        this.addSquareButton=new JButton("Add Square");
        drawingColor= canvas.getColor();
        currentColor.setBackground(drawingColor);
     
        //Adds the buttons to the panel. 
        this.add(this.pickColorButton);
        this.add(this.currentColor);
        this.add(this.addCircleButton);
        this.add(this.addSquareButton);
        
    }
    public DrawingPanel getDrawingPanel(){
        return this.canvas;
    }
    public class ButtonListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event){
             if( event.getActionCommand().equals("Pick Color")){
                 canvas.pickColor();
                 drawingColor=canvas.getColor();
                 currentColor.setBackground(drawingColor);
                 
                }
             else if (event.getActionCommand().equals("Add Circle"))
             {
                 System.out.println("Hi");
                 canvas.addCircle();
                 
                 
                }
             else
             {
                }
        }
        }
     
}
