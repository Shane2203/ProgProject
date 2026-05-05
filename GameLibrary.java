import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class GameLibrary here.
 *
 * @author (Rushane)
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
     * A method to add a game
     *
     */
    public void addGame(Game game)
    {
        games.add(game);           
    }
}
