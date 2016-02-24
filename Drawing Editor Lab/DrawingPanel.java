import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Shape;
import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JColorChooser;


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
//     public class MyMouseListener implements MouseListener
//     {
//         public void mousePressed(MouseEvent e){
//         }
//         }
// 
//     
//     public class MyMouseMotionListener implements MouseMotionListener
//     {
//         public void mouseDragged(MouseEvent e){
//         }
//         }
// 
//     
//     public class MyKeyListener implements KeyListener
//     {
//         public void keyPressed(KeyEvent e){
//         }
//         }
    }
