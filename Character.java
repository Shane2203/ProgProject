
/**
 * Write a description of class Character here.
 *
 * @author (Ozgur)
 * @version (5/4/2)
 */
public class Character extends Singleplayer
{
    // instance variables - replace the example below with your own
    private String name;
    private int health;
    private double attack;
    private double defense;
    
    /**
     * Constructor for objects of class Character
     */
    public Character()
    {
        int health = 20;
        
    }

    /**
     * This is where the Character will be taking damage
     */
    public int takeDamage()
    {
        // put your code here
    }
    
    /**
     * This is where the character will send out an attac
     */
    public int attack()
    {
        
    }
    
    /**
     * This is where the character will regain some health.
     */
    public int heal()
    {
        
    }
    
    /**
     * This is where it increases the character's level by +1.
     */
    public int levelUp()
    {
        
    }
    
    /**
     * This will confirm the character's
     */
    public boolean isAlive()
    {
        if(health > 0) {
            return true;
        } else {
            return false;
        }
    }
}