import java.util.HashSet;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private HashSet<Game> games;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        games = new HashSet<Game>();
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
