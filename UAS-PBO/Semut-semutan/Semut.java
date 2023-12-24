import lang.stride.*;
import greenfoot.*;

public class Semut extends Actor
{
    private int score = 0;

    public Semut()
    {
        GreenfootImage image = getImage();
        image.scale(50, 30); 
        setImage(image);
    }
    
    public void act()
    {
        move(3);
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        makanPizza();
    }

    /**
     * 
     */
    public void makanPizza()
    {
        if(isTouching(pizza.class)){
            removeTouching(pizza.class);
            score = score + 1;
            getWorld().showText("Score: " + score, 100, 30);
        }
        if (score == 10){
            Greenfoot.setWorld(new Win());
        }
    }
}
