/**
 * Represents a video game.
 * 
 * @author Rushane
 */
public class Game
{
    private String gameName;
    private String developer;
    private double version;
    private PlatformType platform;
    private GenreType genre;
    private double rating;
    private boolean isPaused;

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

    @Override 
    public String toString()
    {
        return gameName + " by " + developer + " (" + platform + ")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Game other = (Game) obj;
        return gameName.equals(other.gameName) &&
               developer.equals(other.developer);
    }
}