import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class Cicak extends Actor
{
    public Cicak()
    {
        // Mengatur ukuran awal Cicak
        GreenfootImage image = getImage();
        image.scale(60, 50); 
        setImage(image);
    }
    
    public void act()
    {
        move(3);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        makanSemut();
    }

    public void makanSemut()
    {
        if (isTouching(Semut.class)) {
            removeTouching(Semut.class);
            Greenfoot.setWorld(new Lose());
        }
    }
}
