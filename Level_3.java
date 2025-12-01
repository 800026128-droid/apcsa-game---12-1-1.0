import greenfoot.*;

public class Level_3 extends Actor
{
    private int displayTimer = 150; // Set display time to 150 acts (approx 2.5 seconds)

    public Level_3()
    {
        // Set the image/text for the Level 1 title screen
        // Example: setImage(new GreenfootImage("LEVEL 1: THE OUTSKIRTS", 40, Color.WHITE, Color.BLACK));
    }
    
    public void act()
    {
        displayTimer--;
        
        if (displayTimer <= 0)
        {
            // Remove the object once the timer runs out
            getWorld().removeObject(this);
            // After removal, you might want to start some game logic here if needed
        }
    }
}