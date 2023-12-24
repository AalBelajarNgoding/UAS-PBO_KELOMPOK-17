import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class menu extends Actor
{
    public menu()
    {
        GreenfootImage image = getImage();
        image.scale(200, 100); 
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
        
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
        }
        if (Greenfoot.mouseClicked(this)) {
           Greenfoot.setWorld(new Home());
        }
    }    
}
