import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;

public class Square extends Shape
{
   
    private Point2D.Double center;
    private double radius;
    private Color color;
    private Rectangle2D.Double square;
    


    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        super( center,  radius, color);
        this.center= center;
        this.radius= radius;
        this.color= color; 
        this.square= new Rectangle2D.Double(center.getX()-radius, center.getY()-radius, radius*2, radius*2);
    }

    public void draw(Graphics2D g2, boolean filled){
        g2.draw(square);
        
    }

}
