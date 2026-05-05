import java.util.ArrayList;
import java.util.List;

/**
 * Represents a collection of games.
 * 
 * @author Rushane/Ozgur
 */
public class GameLibrary
{
    private List<Game> games;
    private GenreType gameGenre;
    private AgeRating ageRating;
    private double gameRating;

    public GameLibrary()
    {
        games = new ArrayList<>();
    }

    public void addGame(Game game)
    {
        games.add(game);
    }

    public void removeGame(Game game)
    {
        games.remove(game);
    }

    public int getGameCount()
    {
        return games.size();
    }

    public List<Game> findByGenre(GenreType genre)
    {
        List<Game> result = new ArrayList<>();
        for (Game g : games)
        {
            if (g.getGenre() == genre)
            {
                result.add(g);
            }
        }
        return result;
    }

    public List<Game> findByRating(double rating)
    {
        List<Game> result = new ArrayList<>();
        for (Game g : games)
        {
            if (g.getRating() >= rating)
            {
                result.add(g);
            }
        }
        return result;
    }

    public Game selectGame(int index)
    {
        if (index >= 0 && index < games.size())
        {
            return games.get(index);
        }
        return null;
    }

    public void playGame(Game game)
    {
        if (game != null)
        {
            game.startGame();
        }
    }

    public List<Game> getGames() 
    {
        return games; 
    }

    public GenreType getGameGenre() 
    {
        return gameGenre; 
    }
    
    public void setGameGenre(GenreType gameGenre) 
    { 
        this.gameGenre = gameGenre; 
    }

    public AgeRating getAgeRating() 
    { 
        return ageRating; 
    }
    
    public void setAgeRating(AgeRating ageRating) 
    { 
        this.ageRating = ageRating; 
    }

    public double getGameRating() 
    { 
        return gameRating; 
    }
    
    public void setGameRating(double gameRating) 
    { 
        this.gameRating = gameRating; 
    }

    @Override
    public String toString()
    {
        return "GameLibrary with " + games.size() + " games.";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        GameLibrary other = (GameLibrary) obj;
        return games.equals(other.games);
    }
}