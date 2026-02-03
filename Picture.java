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
    private Triangle thirdLayer;
    private Triangle fourthLayer;
    private Person parent;
    private Person child;
    private Circle ornament1;
    private Circle ornament2;
    private Circle ornament3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
        trunk = new Square();
        bottomLayer = new Triangle();  
        secondLayer = new Triangle();
        thirdLayer = new Triangle();
        fourthLayer = new Triangle();
        parent = new Person();
        child = new Person();
        ornament1 = new Circle();
        ornament2 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            trunk.moveHorizontal(38);
            trunk.moveVertical(100);
            trunk.changeSize(55);
            trunk.changeColor("brown");
            trunk.makeVisible();
    
            bottomLayer.changeSize(85, 190);
            bottomLayer.moveHorizontal(165);
            bottomLayer.moveVertical(10);
            bottomLayer.makeVisible();
    
            secondLayer.changeSize(70, 175);
            secondLayer.moveHorizontal(162);
            secondLayer.moveVertical(-15);
            secondLayer.makeVisible();
            
            thirdLayer.changeSize(55, 160);
            thirdLayer.moveHorizontal(160);
            thirdLayer.moveVertical(-35);
            thirdLayer.makeVisible();
            
            fourthLayer.changeSize(45, 145);
            fourthLayer.moveHorizontal(160);
            fourthLayer.moveVertical(-50);
            fourthLayer.makeVisible();
            
            parent.changeSize(110, 60);
            parent.moveHorizontal(-150);
            parent.moveVertical(5);
            parent.makeVisible();
            
            child.changeSize(60, 30);
            child.moveHorizontal(-100);
            child.moveVertical(40);
            child.makeVisible();
            
            ornament1.changeSize(20);
            ornament1.moveHorizontal(100);
            ornament1.moveVertical(115);
            ornament1.makeVisible();
            
            ornament2.changeSize(20);
            ornament2.moveHorizontal(170);
            ornament2.moveVertical(120);
            ornament2.makeVisible();
            
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
