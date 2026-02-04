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
    private Square background;
    private Square trunk;
    private Triangle bottomLayer;
    private Triangle secondLayer;
    private Triangle thirdLayer;
    private Triangle fourthLayer;
    private Person mom;
    private Person dad;
    private Person child;
    private Circle ornament1;
    private Circle ornament2;
    private Circle ornament3;
    private Circle ornament4;
    private Circle ornament5;
    private Circle ornament6;
    private Circle ornament7;
    private Square present1;
    private Square present2;
    private Square present3;
    private Square present4;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square();
        trunk = new Square();
        bottomLayer = new Triangle();  
        secondLayer = new Triangle();
        thirdLayer = new Triangle();
        fourthLayer = new Triangle();
        mom = new Person();
        dad = new Person();
        child = new Person();
        ornament1 = new Circle();
        ornament2 = new Circle();
        ornament3 = new Circle();
        ornament4 = new Circle();
        ornament5 = new Circle();
        ornament6 = new Circle();
        ornament7 = new Circle();
        present1 = new Square();
        present2 = new Square();
        present3 = new Square();
        present4 = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-350);
            background.moveVertical(-350);
            background.changeSize(1000);
            background.changeColor("white");
            background.makeVisible();
            
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
            
            mom.changeSize(100, 50);
            mom.moveHorizontal(-150);
            mom.moveVertical(10);
            mom.makeVisible();
            
            dad.changeSize(115, 60);
            dad.moveHorizontal(-210);
            dad.moveVertical(0);
            dad.makeVisible();

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
            ornament2.moveVertical(123);
            ornament2.changeColor("red");
            ornament2.makeVisible();
            
            ornament3.changeSize(20);
            ornament3.moveHorizontal(140);
            ornament3.moveVertical(90);
            ornament3.changeColor("yellow");
            ornament3.makeVisible();
            
            ornament4.changeSize(20);
            ornament4.moveHorizontal(100);
            ornament4.moveVertical(70);
            ornament4.changeColor("magenta");
            ornament4.makeVisible();
            
            ornament5.changeSize(20);
            ornament5.moveHorizontal(160);
            ornament5.moveVertical(50);
            ornament5.changeColor("red");
            ornament5.makeVisible();
            
            ornament6.changeSize(20);
            ornament6.moveHorizontal(115);
            ornament6.moveVertical(40);
            ornament6.makeVisible();
            
            ornament7.changeSize(20);
            ornament7.moveHorizontal(135);
            ornament7.moveVertical(15);
            ornament7.changeColor("magenta");
            ornament7.makeVisible();
            
            present1.moveHorizontal(0);
            present1.moveVertical(125);
            present1.changeSize(30);
            present1.changeColor("red");
            present1.makeVisible();
            
            present2.moveHorizontal(-25);
            present2.moveVertical(135);
            present2.changeSize(20);
            present2.changeColor("magenta");
            present2.makeVisible();
            
            present3.moveHorizontal(100);
            present3.moveVertical(120);
            present3.changeSize(35);
            present3.changeColor("yellow");
            present3.makeVisible();
            
            present4.moveHorizontal(145);
            present4.moveVertical(140);
            present4.changeSize(15);
            present4.changeColor("blue");
            present4.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        trunk.changeColor("white");
        bottomLayer.changeColor("white");
        secondLayer.changeColor("white");
        thirdLayer.changeColor("white");
        fourthLayer.changeColor("white");
        mom.changeColor("white");
        dad.changeColor("white");
        child.changeColor("white");
        ornament1.changeColor("black");
        ornament2.changeColor("black");
        ornament3.changeColor("black");
        ornament4.changeColor("black");
        ornament5.changeColor("black");
        ornament6.changeColor("black");
        ornament7.changeColor("black");
        present1.changeColor("white");
        present2.changeColor("white");
        present3.changeColor("white");
        present4.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("white");
        trunk.changeColor("brown");
        bottomLayer.changeColor("green");
        secondLayer.changeColor("green");
        thirdLayer.changeColor("green");
        fourthLayer.changeColor("green");
        mom.changeColor("black");
        dad.changeColor("black");
        child.changeColor("black");
        ornament1.changeColor("blue");
        ornament2.changeColor("red");
        ornament3.changeColor("yellow");
        ornament4.changeColor("magenta");
        ornament5.changeColor("red");
        ornament6.changeColor("blue");
        ornament7.changeColor("magenta");
        present1.changeColor("red");
        present2.changeColor("magenta");
        present3.changeColor("yellow");
        present4.changeColor("blue");
        
    }
}
