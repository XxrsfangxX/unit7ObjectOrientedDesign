import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Point;


public class Square extends Shape
{
   
   
    private Rectangle2D.Double square;
    


    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        super( center,  radius, color);

        this.square= new Rectangle2D.Double(center.getX()-radius, center.getY()-radius, radius*2, radius*2);
    }
    
       public void draw(Graphics2D g2, boolean filled){
        //Draws Circle
        g2.setColor(this.getColor());
        g2.draw(new Rectangle2D.Double(this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2));
        //If filled true fills circle
        if(filled==true){
            g2.fill(new Rectangle2D.Double(this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2));
        }
    }

        public boolean isInside(Point2D.Double point){
        double x = point.getX();
        double y = point.getY();
        Rectangle2D.Double rectangle2= new Rectangle2D.Double(this.getCenter().getX()-this.getRadius(), this.getCenter().getY()-this.getRadius(), this.getRadius()*2, this.getRadius()*2);
        return rectangle2.contains(x,y);
    }
    

}
