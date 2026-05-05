
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
    public Multiplayer(String name,PlatformType platform,int maxPlayers,GameModeType mode)
    {
        //name, developer, version, platform, genre, rating
        super(name, "Unknown", 1.0, platform, GenreType.ACTION, 0.0);
        this.maxPlayers = maxPlayers;
        this.playerCount = 0; // Starts with no players
        this.gameMode = mode;
        
    }
    public int getMaxPlayers()
    {
        return maxPlayers;
    }
    public void setMaxPlayers(int maxPlayers)
    {
        this.maxPlayers = maxPlayers;
    }
    public int getPlayerCount()
    {
        return playerCount;
    }
    public void setPlayerCount(int playerCount)
    {
        this.playerCount = playerCount;
    }
    public GameModeType getGameMode()
    {
        return gameMode;
    }
    public void setGameMode(GameModeType mode)
    {
        this.gameMode = mode;
    }
    public void addPlayer()
    {
        if(!isLobbyFull()){
            playerCount++;
        }
    }
    
    public boolean isLobbyFull()
    {
        return playerCount >= maxPlayers;
    }
    
    public void changeGameMode(GameModeType mode)
    {
        this.gameMode = mode;
    }
    @Override
    public String toString()
    {
        return super.toString() + " | Mode: " + gameMode + " Players: " + playerCount + "/" + maxPlayers;  
    }
    @Override
    public boolean equals(Object obj)
    { 
        if (this == obj) return true;
        if(!(obj instanceof Multiplayer)) return false;
        if(!super.equals(obj)) return false;
        Multiplayer other = (Multiplayer) obj;
        return this.maxPlayers == other.maxPlayers && this.gameMode == other.gameMode;
    }
}
