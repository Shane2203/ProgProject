import java.util.Scanner;
import java.util.List;

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
    
    private static Scanner scanner = new Scanner(System.in);
    private static GameLibrary library = new GameLibrary();
    
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
    
    public static void addGame()
    {
        System.out.print("Enter game name: ");
        String name = scanner.nextLine();
    
        System.out.print("Enter developer: ");
        String developer = scanner.nextLine();
    
        System.out.print("Enter version: ");
        double version = scanner.nextDouble();
        scanner.nextLine();
    
        System.out.println("Choose Platform:");
        System.out.println("1. PC");
        System.out.println("2. PLAYSTATION");
        System.out.println("3. XBOX");
        System.out.println("4. SWITCH");
    
        int platformChoice = scanner.nextInt();
        scanner.nextLine();
    
        PlatformType platform = null;
    
        switch(platformChoice)
        {
            case 1:
                platform = PlatformType.PC;
                break;
    
            case 2:
                platform = PlatformType.PLAYSTATION;
                break;
    
            case 3:
                platform = PlatformType.XBOX;
                break;
    
            case 4:
                platform = PlatformType.NINTENDO_SWITCH;
                break;
    
            default:
                System.out.println("Invalid platform.");
                return;
        }
    
        System.out.println("Choose Genre:");
        System.out.println("1. ACTION");
        System.out.println("2. RPG");
        System.out.println("3. SPORTS");
    
        int genreChoice = scanner.nextInt();
        scanner.nextLine();
    
        GenreType genre = null;
    
        switch(genreChoice)
        {
            case 1:
                genre = GenreType.ACTION;
                break;
    
            case 2:
                genre = GenreType.RPG;
                break;
    
            case 3:
                genre = GenreType.SPORTS;
                break;
    
            default:
                System.out.println("Invalid genre.");
                return;
        }
    
        System.out.print("Enter rating: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();
    
        Game game = new Game(name, developer, version,
                             platform, genre, rating);
    
        library.addGame(game);
    
        System.out.println("Game added successfully.");
    }
}