import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle()
    {
        super();
    }
    
    public double getPerimeter(){
    
        return (this.height*2)+(this.width*2);
    }
    
    public double getArea(){
        return this.height*this.width;
    }
    

}
