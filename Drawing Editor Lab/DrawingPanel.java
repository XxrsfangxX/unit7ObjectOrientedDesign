import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Shape;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import java.awt.Point;


/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private ArrayList<Shape> shapes;
    private Color drawingColor;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.white);
        this.drawingColor= Color.red;
        this.pickColor();
        MouseListener listener= new MyMouseListener();
        this.addMouseListener(listener);
    }
    
    public void pickColor(){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        Color color= Color.white;
        this.drawingColor = JColorChooser.showDialog(frame,"Pick a color",color);
    }
  
    public Color getColor(){
        return drawingColor;
    }
    public class MyMouseListener implements MouseListener
    {
        public void mousePressed(MouseEvent e){
            Point point= e.getLocationOnScreen();
            for(Shape i:shapes){
                if( i.contains(point)){
                    System.out.println("Shape has been touched");
                }
            
            }
            
            
            
        }
        public void mouseClicked(MouseEvent e){
            
        }
        public void mouseReleased(MouseEvent e){
            
        }
        public void mouseEntered(MouseEvent e){
            
        }
        public void mouseExited(MouseEvent e){
            
        }
        }

    
    public class MyMouseMotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e){
        }
        public void mouseMoved(MouseEvent e){
        }
        }

    
    public class MyKeyListener implements KeyListener
    {
        public void keyPressed(KeyEvent e){
        }
        public void keyTyped(KeyEvent e){
        }
        public void keyReleased(KeyEvent e){
        }
        }
    }
