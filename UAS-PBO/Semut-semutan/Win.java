import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,100,344);
        menu menu = new menu();
        addObject(menu,500,344);
    }
}
