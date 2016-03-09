import java.awt.geom.Point2D;   
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

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

    public Color getColor(){
        return color;
    }
    
    public void move(double x, double y){
        this.center= new Point2D.Double(x,y);
    }
    public double getRadius(){
        return radius; 
    }
    
    public void setRaidus(Double r){
        this.radius=r; 
    }
    public boolean isInside(Point2D.Double point){
        return true; 
    }
    
    
    public boolean isOnBorer(Point point){
        
        return true;
    }
    abstract void draw(Graphics2D g2, boolean filled);
        
     
}
