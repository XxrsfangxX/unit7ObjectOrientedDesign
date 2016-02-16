import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Write a description of class TriangleFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private TriangleComponent scene;
    private int clicks;

     class MyMouseListener implements MouseListener
    {
        public void mousePressed(MouseEvent event){
            int x= event.getX();
            int y = event.getY();
            scene.drawDot(x, y);
        }

        public void mouseReleased(MouseEvent event){}

        public void mouseClicked(MouseEvent event){}

        public void mouseEntered(MouseEvent event){}

        public void mouseExited(MouseEvent event){}
      
    }
    
      public TriangleFrame(){
        this.scene= new TriangleComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        MouseListener listener= new MyMouseListener();
        scene.addMouseListener(listener);
        

       }
    
}
