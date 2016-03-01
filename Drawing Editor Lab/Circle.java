import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;
    private Ellipse2D.Double circle;


    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        super(center, radius,  color);
        this.center= center;
        this.radius= radius;
        this.color= color; 
        this.circle= new Ellipse2D.Double( center.getX()-radius, center.getY()-radius, radius*2, radius*2); 
    }

    public void draw(Graphics2D g2, boolean filled){
        g2.draw(circle);
        
    }

}
