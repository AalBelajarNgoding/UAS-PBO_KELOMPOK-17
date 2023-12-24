import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        GreenfootImage background = getBackground();
        background.scale(1200, 1000);  
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,100,342);
        menu menu = new menu();
        addObject(menu,500,345);
    }
}
