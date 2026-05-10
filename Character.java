/**
 * Represents a character in a game with combat-related stats.
 * A character object has health, attack, defense, and can perform actions (Attacking, taking dmg, healing, and leveling up).
 * 
 * @author Ozgur
 */
public class Character 
{
    // variable for the creation of a character
    private String name;
    private int health;
    private double attack;
    private double defense;
    private int level;
    /*
     * Constructor, initializes all important stats.
     */
    public Character(String name, int health, double attack, double defense)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = 1;
    }
    
    /*
     * reduces character health, defense will reduce amount of damage taken.
     */ 
    public void takeDamage(double damage)
    {
        double reducedDamage = damage - defense;
        if (reducedDamage < 0) reducedDamage = 0; //prevents negative damage

        health -= reducedDamage;

        if (health < 0)
        {
            health = 0;
        }
    }
    
    /*
     * calculate the attack damage. attack increases based off level
     */
    public double attack()
    {
        return attack * level;
    }
    
    /*
     * increases health by amount
     */
    public void heal(int amount)
    {
        health += amount;
    }
    
    /*
     * increases level and once increased, stats improve.
     */
    public void levelUp()
    {
        level++;
        attack += 2;
        defense += 1;
    }
    
    /*
     * checks if character alive. 
     */
    public boolean isAlive()
    {
        return health > 0;
    }
    
    /*
     * getters
     */
    public String getName() 
    { 
        return name; 
    }
    
    public int getHealth() 
    { 
        return health; 
    }
    
    public double getAttack() 
    { 
        return attack; 
    }
    
    public double getDefense() 
    { 
        return defense; 
    }
    
    public int getLevel() 
    { 
        return level; 
    }
    
    /*
     * Setters
     */
    public void setName(String name) 
    { 
        this.name = name; 
    }
    
    public void setHealth(int health) 
    { 
        this.health = health; 
    }
    
    public void setAttack(double attack) 
    { 
        this.attack = attack; 
    }
    
    public void setDefense(double defense) 
    { 
        this.defense = defense; 
    }
    
    /*
     * returns description of character
     */
    @Override
    public String toString()
    {
        return name + " [HP: " + health + ", ATK: " + attack + ", DEF: " + defense + "]";
    }

    /*
     * compares two character obj based off name.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Character other = (Character) obj;
        return name.equals(other.name);
    }
}