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
    
    
     

    

    
  
    public DrawingEditor(ControlPanel controls)
    
    {
        this.frame= new JFrame();
        frame.setTitle("Drawing Editor");
        frame.add(controls, BorderLayout.SOUTH);
        
        
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

        
        
    }
    
    public static void main(String args[]){
        ControlPanel controls= new ControlPanel();
        DrawingEditor dW= new DrawingEditor(controls);
        
        
    }

}
