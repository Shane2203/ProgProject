import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CharacterTest.
 *
 * @author  Ozgur
 * @version (a version number or a date)
 */
public class CharacterTest
{
    @Test
    public void testTakeDamage()
    {
        Character c = new Character("Hero", 100, 10, 5);
        c.takeDamage(20);

        assertTrue(c.getHealth() < 100);
    }

    @Test
    public void testIsAlive()
    {
        Character c = new Character("Hero", 10, 10, 5);
        c.takeDamage(50);

        assertFalse(c.isAlive());
    }
}