import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class restart extends Actor
{
    public restart()
    {
        GreenfootImage image = getImage();
        image.scale(200, 100); 
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(5); 
              Greenfoot.setWorld(new MyWorld());
            }
        if(Greenfoot.mousePressed(this)){
               getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9) );
            }
    }    
}
