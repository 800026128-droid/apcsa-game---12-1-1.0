import greenfoot.*;

public class Level_1 extends Actor
{


    public Level_1()
    {
        // Set the image/text for the Level 1 title screen
        // Example: setImage(new GreenfootImage("LEVEL 1: THE OUTSKIRTS", 40, Color.WHITE, Color.BLACK));
    }
    
    public void act()
    {
        
        if (Greenfoot.mouseMoved(null))
        {
            // Remove the object once the timer runs out
            getWorld().removeObject(this);
            // After removal, you might want to start some game logic here if needed
        }
    }
}