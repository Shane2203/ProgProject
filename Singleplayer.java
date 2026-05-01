
/**
 * Write a description of class Singleplayer here.
 *
 * @author (your name)
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
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void loadCheckpoint()
    {
        // put your code here
        System.out.println("Loading checkpoiny" + currentCheckpoint);
    }
    
    public void restartLevel()
    {
        currentCheckpoint = 0;
    }
}