import java.util.HashSet;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary extends Game
{
    private String gameGenre;
    private int ageRating;
    private double gameRating;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary(String genre)
    {
        // initialise instance variables
        this.gameGenre = genre;
        int ageRating = 0;
        double gameRating = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int ageRating()
    {
        return ageRating;           
    }
}
