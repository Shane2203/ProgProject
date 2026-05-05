/**
 * Represents a character in a game.
 * 
 * @author Ozgur
 */
public class Character extends Singleplayer
{
    private String name;
    private int health;
    private double attack;
    private double defense;
    private int level;

    public Character(String name, int health, double attack, double defense)
    {
        super(name,PlatformType.PC,DifficultyLevel.NORMAL);
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = 1;
    }

    public void takeDamage(double damage)
    {
        double reducedDamage = damage - defense;
        if (reducedDamage < 0) reducedDamage = 0;

        health -= reducedDamage;

        if (health < 0)
        {
            health = 0;
        }
    }

    public double attack()
    {
        return attack * level;
    }

    public void heal(int amount)
    {
        health += amount;
    }

    public void levelUp()
    {
        level++;
        attack += 2;
        defense += 1;
    }

    public boolean isAlive()
    {
        return health > 0;
    }

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

    @Override
    public String toString()
    {
        return name + " [HP: " + health + ", ATK: " + attack + ", DEF: " + defense + "]";
    }

    /*
     * compares two character obj
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