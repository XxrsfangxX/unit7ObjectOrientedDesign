import javax.swing.JFrame;



import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.BorderLayout;


public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH= 100;
     private static final int FRAME_HEIGHT= 60;
     
     private JFrame frame;
    
    
     

    

    
  
    public DrawingEditor( DrawingPanel canvas,ControlPanel controls)
    
    {
        //creates the frame. 
        
        this.setTitle("Drawing Editor");
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        
        
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        

        
        
    }
    
    public static void main(String args[]){
        DrawingPanel canvas= new DrawingPanel();
        ControlPanel controls= new ControlPanel(canvas);
        
        DrawingEditor dW= new DrawingEditor(canvas, controls);
        
        
    }

}
