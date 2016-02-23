import javax.swing.JPanel;
import javax.swing.JButton;
public class ControlPanel extends JPanel
{
    private JButton pickColorButton;
     private JButton addCircleButton;
     private JButton addSquareButton;
     private JPanel currentColor;
    
    public ControlPanel(){
        
       
        this.currentColor= new JPanel();
       
        this.pickColorButton= new JButton("Pick Color");
        
        this.addCircleButton= new JButton("Add Circle");
        
        
        this.addSquareButton=new JButton("Add Square");
        
        this.add(this.pickColorButton);
        this.add(this.addCircleButton);
        this.add(this.addSquareButton);
    }
     
}
