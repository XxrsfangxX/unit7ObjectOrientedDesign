import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;



/**
 * Write a description of class ButtonView here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonView
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH= 1000;
     private static final int FRAME_HEIGHT= 600;
     
     private JFrame frame;
     private JLabel label;
     private JPanel panel;
     private JButton button;
     private JButton button2;
    

    
    
    public ButtonView(){
        this.frame= new JFrame();
        this.panel= new JPanel();
        
        this.button= new JButton(" A ");
        this.panel.add(this.label);
        
        this.button2= new JButton(" B ");
        this.panel.add(this.button2);
        
        ClickListener listener= new ClickListener();
        this.button.addActionListener(listener);
        
        
        this.button2.addActionListener(listener);
        
        frame.add(panel);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String Args[]){
        ButtonView buttonview= new ButtonView();
    }
    
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
           label.setText("Button"+ event.getActionCommand()+ " was clicked!");
       
        
        }
        }


}



