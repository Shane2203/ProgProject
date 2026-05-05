
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
    public Singleplayer(String name,PlatformType platform,DifficultyLevel difficulty)
    {
        //Passes info to Game constructor: name, developer, version, platform, genre, rating
        super(name, "Unknown", 1.0, platform, GenreType.ACTION, 0.0);
        
        this.difficultyLevel = difficulty;
        this.currentCheckpoint = 0; // Starting value
        this.storyProgress = 0.0; // 0% progress
        
    

    }
    public DifficultyLevel getDIfficultyLevel()
    {
        return difficultyLevel; //Returns the current difficulty
    }
    public int getCurrentCheckpoint()
    {
        return currentCheckpoint; //Returns the number of the current checkpoint
    }
    public double getStoryProgress()
    { 
        return storyProgress;
    }
    public void setDifficultyLevel(DifficultyLevel difficultyLevel)
    {
        this.difficultyLevel = difficultyLevel; 
        // Allows to change the difficulty mid-game
    }
    public void setCurrentCheckpoint(int currentCheckpoint)
    {
        this.currentCheckpoint = currentCheckpoint;
        //Allows to update the player's checkpoint
    }
    public void setStoryProgress(double storyProgress)
    {
        this.storyProgress = storyProgress;
        //Allows to update the progress
    }
    

    public void loadCheckpoint()
    {
        // put your code here
        System.out.println("Loading checkpoint" + currentCheckpoint);
    }
    
    public void restartLevel()
    {
        currentCheckpoint = 0;
    }
    @Override 
    public String toString()
    {
        return "Singleplayer Game: " + getGameName() + " | Difficulty: " + difficultyLevel + " | Progress: " + storyProgress + "%";
    }
    @Override
    public boolean equals(Object obj)
    { 
        if (this == obj) return true;
        if (!(obj instanceof Singleplayer)) return false;
        if (!super.equals(obj)) return false; // checks if game name/platform match
        
        Singleplayer other = (Singleplayer) obj;
        return this.difficultyLevel == other.difficultyLevel &&
               this.currentCheckpoint == other.currentCheckpoint;
    }
    }
