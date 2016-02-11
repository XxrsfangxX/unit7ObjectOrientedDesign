

/**
 * Write a description of class TriangleFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleFrame extends JFrame
{
   
    

   

    public class MyMouseListener implements MouseListener
    {
        private int clicked=0;    
        public void mouseClicked(Mouse event){
            if(clicked>=4){
                clicked=0;
                component.clear();
            }
            else if( clicked==3){
                int x= event.getX();
                int y= event.getY();
                component.drawDot(x,y);
                component.drawTri(xValues, yValues);
            }
            else{

                int x= event.getX();
                int y= event.getY();
                component.drawDot(x,y);
            }
            clicked++;
        }

    }
}
