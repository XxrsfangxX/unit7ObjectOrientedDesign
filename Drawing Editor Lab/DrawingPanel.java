import javax.swing.JPanel;
import java.awt.Color;

import java.util.ArrayList;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JColorChooser;
import java.awt.Point;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.util.Random;

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
    private Shape activeShape;
    private boolean isFound;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.white);
        this.drawingColor= Color.red;
        this.pickColor();
        this.shapes= new ArrayList<Shape>();
        MouseListener listener= new MyMouseListener();
        MouseMotionListener listener1= new MyMouseMotionListener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(listener1);
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
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(this.drawingColor);

        for(Shape shape: shapes){
            if(shape!=this.activeShape){
                shape.draw(g2,true);
            }
            
        }
        if(this.activeShape!=null){
            activeShape.draw(g2, false);
        }
        repaint();
        }
    
    public void addCircle(){
        Random rand= new Random();
        Circle circle= new Circle(new Point2D.Double(300,300), rand.nextInt(75), this.drawingColor);
        shapes.add(0,circle);
    

    }
    
    public void addSquare(){
        Random rand= new Random();
        Square square= new Square (new Point2D.Double(300,300), rand.nextInt(100), this.drawingColor);
        shapes.add(0,square);
    }
    
 
    public class MyMouseListener implements MouseListener
    {
        public void mousePressed(MouseEvent e){
            isFound=false;
            int x= e.getX();
            int y= e.getY();
            for(Shape shape :shapes){
                if( shape.isInside(new Point2D.Double(x,y))==true){
                    isFound=true;
                    activeShape= shape;
                    
                    
                }
   
            }
            if(!isFound){
                activeShape= null;
            }
            repaint();
            

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
        public void mouseDragged(MouseEvent event){
  
            if (activeShape!=null){
            activeShape.move(event.getX(), event.getY());
            repaint();
        }
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
