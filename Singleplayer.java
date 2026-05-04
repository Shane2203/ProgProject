
/**
 * Write a description of class Singleplayer here.
 *
 * @author (Rushane)
 * @version (a version number or a date)
 */
public class Singleplayer extends Game
{
    // instance variables - replace the example below with your own
    private DifficultyLevel difficultyLevel;
    private int currentCheckpoint;
    private double storyProgress;

    /**
     * Constructor for objects of class Singleplayer
     */
    public Singleplayer()
    {

    }

    /**
     *
     * 
     */
    public void loadCheckpoint()
    {
        // put your code here
        System.out.println("Loading checkpoint" + currentCheckpoint);
    }
    
    /**
     * 
     */
    public void restartLevel()
    {
        currentCheckpoint = 0;
    }
}