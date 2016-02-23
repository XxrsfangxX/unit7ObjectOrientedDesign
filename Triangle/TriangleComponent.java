import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;



/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private Ellipse2D.Double dot1;
    private Ellipse2D.Double dot2;
    private Ellipse2D.Double dot3;
    private Polygon triangle;
    private int[] xCords;
    private int[] yCords;
    private int clicks=0;
    
   
    public TriangleComponent(){
        Ellipse2D.Double dot1= new Ellipse2D.Double( 10, 10, 1,1);
        this.dot1= dot1;
        Ellipse2D.Double dot2= new Ellipse2D.Double( 12, 12, 1,1);
        this.dot2= dot2;
        Ellipse2D.Double dot3= new Ellipse2D.Double( 1,1 , 1,1);
        this.dot3= dot3;
        
        Polygon triangle= new Polygon();
        this.triangle= triangle;
        
        int[] xCords= new int[3];
        this.xCords= xCords;
        this.xCords[0]= (int) dot1.getX();
        this.xCords[1]= (int)dot2.getX();
        xCords[2]= (int) dot3.getX();
        int[] yCords= new int[3];
        yCords[0]= (int) dot1.getY();
        yCords[1]= (int)dot2.getY();
        yCords[2]= (int)dot3.getY();
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2= (Graphics2D) g;
        g2.draw(dot1);
        g2.draw(dot2);
        g2.draw(dot3);
        g2.draw(triangle);
        
       
        
    }
    
    public void drawDot( int x, int y){ 
        this.clicks++;
       
        if( this.clicks==1){
             Ellipse2D.Double dot1= new Ellipse2D.Double( x, y, 5,5);  
             this.dot1= dot1;
             xCords[0]= (int)dot1.getX();
             yCords[0]= (int)dot1.getY();
             repaint();
            }
            else if(this.clicks==2){
                Ellipse2D.Double dot2= new Ellipse2D.Double( x, y, 5,5);  
                this.dot2= dot2;
                xCords[1]= (int)dot2.getX();
                yCords[1]= (int)dot2.getY();
                repaint();
            }
            else if(this.clicks==3){
                Ellipse2D.Double dot3= new Ellipse2D.Double( x, y, 5,5);  
                this.dot3= dot3;
                xCords[2]= (int)dot3.getX();
                yCords[2]= (int)dot3.getY();
                Polygon triangle= new Polygon(xCords, yCords, 3);
                repaint();
                
                
            }
            else{
                
                clicks=0;
            
            }
            clicks++;
         
    }
}
