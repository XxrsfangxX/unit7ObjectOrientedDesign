import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.awt.Point;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private Polygon triangle;
    private int[] xCords;
    private int[] yCords;
    
    private int xCord;
    private int yCord;
    
    public TriangleComponent(){
        
            this.triangle= new Polygon( xCords, yCords, 3);
        
        
    }

     
    
    public void drawDot(int x, int y)
    {
        this.xCord= x;
        this.yCord=y;
        Point point= new Point(x, y);
        Graphics2D g=  (Graphics2D) g;
        g.draw(point);
    }
    
    public void drawTri( int[] x, int[] y){
        this.xCords= x;
        this.yCords= y;
    }
    
    
    
}
