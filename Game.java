import java.util.HashSet;

/**
 * Write a description of class Game here.
 *
 * @author (Rushane)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String gameName;
    private String developer;
    private double version;
    private PlatformType platform;
    private boolean isPaused;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        
    }

    /**
     * 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startGame()
    {
        // initialise instance variables
        isPaused = false;
        System.out.println(gameName + "started.");

    }
    
    /**
     * 
     */
    public void pauseGame()
    {
        isPaused = true;
    }
    
    /**
     * 
     */public void  resumeGame()
    {
        isPaused = false;
    }
    
    /**
     */
    public void stopGame()
    {
        System.out.println("Game stopped");
    }
}   

