import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameLibrary
{
    private List<Game> games;
    private GenreType gameGenre;
    private AgeRating ageRating;
    private double gameRating;

    /**
     * Constructor for objects of class GameLibrary
     */
    public GameLibrary()
    {
        // initialise instance variables
        games = new ArrayList<Game>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addGame(Game game)
    {
        games.add(game);           
    }
}
