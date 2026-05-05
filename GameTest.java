

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  Shane
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    
    public GameTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void testConstructor()
    {
        //Arrange: Create a new Game object
        Game game = new Game ("Super Mario", "Nintendo", 1.0, PlatformType.PC, GenreType.ACTION, 4.5);
        
        //Assert: Check if attributes were set correctly
        assertEquals("Super Mario", game.getGameName());
        assertEquals("Nintendo", game.getDeveloper());
        assertEquals(1.0, game.getVersion(), 0.001); //0.001 is for double precision
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void testSetter()
    {
        Game game = new Game ("Indie Game", "Dev", 1.0, PlatformType.PC, GenreType.RPG, 3.0);
        
        //Act: Use a setter to change the name
        game.setGameName("Indie Sequel");
        
        //Assert: Verify the change
        assertEquals("Indie Sequel", game.getGameName());
        
    }
    @Test
    public void testToString()
    {
        Game game = new Game("Zelda", "Nintendo", 1.2, PlatformType.NINTENDO_SWITCH, GenreType.ACTION,5.0);
        String expected = "Game Name: Zelda, Developer: Nintendo";
        //Assert that the result contains your key information
        assertTrue(game.toString().contains("Zelda"));
        
    }
}