import java.awt.geom.Point2D;
import java.awt.Color;


public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;

    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        this.center= center;
        this.radius= radius;
        this.color= color; 
    }
    
    public Point2D.Double getCenter(){
        return center; 
    }
    
    public double getRadius(){
        return radius; 
    }
    
    public boolean isInside(Point2D.Double point){
        return true;
        
    }
}
