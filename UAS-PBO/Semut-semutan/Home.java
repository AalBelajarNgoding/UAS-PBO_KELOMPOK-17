import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Home extends World
{

    public GreenfootSound music = new GreenfootSound("background.mp3");
    public void started() 
    {
        music.setVolume(50);
        music.play();
    }

    public void stopped()
    {
        music.stop();
        music.pause();
    }
    
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        GreenfootImage background = getBackground();
        background.scale(1200, 800);  
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mulai mulai = new mulai();
        addObject(mulai,86,82);
        keluar keluar = new keluar();
        addObject(keluar,89,311);
        about about = new about();
        addObject(about,88,192);
        
        
    }
}
