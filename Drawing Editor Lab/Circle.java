import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

import java.awt.Graphics2D;
import java.awt.Point;

public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */

    private Ellipse2D.Double circle;


    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        super(center, radius,  color);

        this.circle= new Ellipse2D.Double( center.getX()-radius, center.getY()-radius, radius*2, radius*2); 
    }

    public void draw(Graphics2D g2, boolean filled){
        //Draws Circle
        g2.setColor(this.getColor());
        g2.draw(new Ellipse2D.Double( this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2));
        //If filled true fills circle
        if(filled==true){
            g2.fill(new Ellipse2D.Double( this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2));
        }
    }
    
    public boolean isInside(Point2D.Double point){
        double x = point.getX();
        double y = point.getY();
        Ellipse2D.Double circle2= new Ellipse2D.Double( this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2);
        return circle2.contains(x,y);
    }
    
    public boolean isOnBorder(Point point){
        return true;
    }

}