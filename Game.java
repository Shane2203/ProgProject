/**
 * Represents a video game.
 * This class provides method to control gameplay
 * 
 * this is the base for the other classes.
 * 
 * @author Rushane
 */
public class Game
{
    //attributes for the game
    private String gameName;
    private String developer;
    private double version;
    private PlatformType platform;
    private GenreType genre;
    private double rating;
    private boolean isPaused;

    /*
     * Constructor intializes all important attributes.
     */
    public Game(String name, String developer, double version,
                PlatformType platform, GenreType genre, double rating)
    {
        this.gameName = name;
        this.developer = developer;
        this.version = version;
        this.platform = platform;
        this.genre = genre;
        this.rating = rating;
        this.isPaused = false;
    }

    public void startGame()
    {
        isPaused = false;
        System.out.println(gameName + " started.");
    }

    public void pauseGame()
    {
        isPaused = true;
    }

    public void resumeGame()
    {
        isPaused = false;
    }

    public void stopGame()
    {
        System.out.println("Game stopped.");
    }
    
    /*
     * Getters
     */
    public String getGameName() 
    { 
        return gameName; 
    }
    
    public String getDeveloper() 
    { 
        return developer; 
    }
    
    public double getVersion() 
    { 
        return version; 
    }
    
    public PlatformType getPlatform() 
    { 
        return platform; 
    }
    
    public GenreType getGenre() 
    { 
        return genre; 
    }
    
    public double getRating() 
    { 
        return rating; 
    }
    
    public boolean isPaused() 
    { 
        return isPaused; 
    }
    
    /*
     * Setters
     */
    public void setGameName(String gameName) 
    { 
        this.gameName = gameName; 
    }
    
    public void setDeveloper(String developer) 
    { 
        this.developer = developer; 
    }
    
    public void setVersion(double version) 
    { 
        this.version = version; 
    }
    
    public void setPlatform(PlatformType platform) 
    { 
        this.platform = platform; 
    }
    
    public void setGenre(GenreType genre) 
    { 
        this.genre = genre; 
    }
    
    public void setRating(double rating) 
    { 
        this.rating = rating; 
    }
    
    /*
     * returns description of game.
     */
    @Override 
    public String toString()
    {
        return gameName + " by " + developer + " (" + platform + ")";
    }
    
    /*
     * Compares two game objects.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Game other = (Game) obj;
        return gameName.equals(other.gameName) && developer.equals(other.developer);
    }
}