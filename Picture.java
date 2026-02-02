/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    
    private Square trunk;
    private Triangle bottomLayer;
    private Triangle secondLayer;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
        trunk = new Square();
        bottomLayer = new Triangle();  
        secondLayer = new Triangle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            trunk.moveHorizontal(-85);
            trunk.moveVertical(100);
            trunk.changeSize(40);
            trunk.changeColor("blue");
            trunk.makeVisible();
            
            
    
            bottomLayer.changeSize(60, 180);
            bottomLayer.moveHorizontal(30);
            bottomLayer.moveVertical(30);
            bottomLayer.makeVisible();
    
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        
        bottomLayer.changeColor("black");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
        
        bottomLayer.changeColor("green");
        
    }
}
