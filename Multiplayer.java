
/**
 * Write a description of class Multiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplayer extends Game

{
    private int maxPlayers;
    private int playerCount;
    private GameModeType gameMode;
    
    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer()
    {
        
    }
    
    public void addPlayer()
    {
        if(!isLobbyFull()) playerCount++;
    }
    
    public boolean isLobbyFull()
    {
        return playerCount >= maxPlayers;
    }
    
    public void changeGameMode(GameModeType mode)
    {
        this.gameMode = mode;
    }
}