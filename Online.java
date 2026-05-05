
/**
 * Write a description of class Online here.
 *
 * @author (Rushane)
 * @version (a version number or a date)
 */
public class Online extends Multiplayer
{
    // instance variables - replace the example below with your own
    private String serverAddress;
    private int ping;
    private String sessionId;

    /**
     * Constructor for objects of class Online
     */
    public Online(String name, PlatformType platform, int maxPlayers,GameModeType mode, String serverAddress)
    {
        super(name, platform, maxPlayers, mode);
        this.serverAddress = serverAddress;
        this.ping = 0;
        this.sessionId = "PENDING";

    }

    public String getServerAddress()
    {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress)
    {
        this.serverAddress = serverAddress;
    }

    public int getPing()
    {
        return ping;
    }

    public void setPing(int ping)
    {
        this.ping = ping;
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public void setSessionId(String sessionId)
    {
        this.sessionId = sessionId;
    }

    public void connectToServer(String address)
    {
        // put your code here
        this.serverAddress = address;
    }

    /**
     * 
     */public void disconnect()
    {
        System.out.println("Disconnected from server.");
    }

    @Override
    public String toString() 
    {
        return super.toString() + " [Server: " + serverAddress + " | Ping: " + ping + "ms]";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Online)) return false;
        if (!super.equals(obj)) return false;
        Online other = (Online) obj;
        return this.serverAddress.equals(other.serverAddress) && 
        this.sessionId.equals(other.sessionId);

    }
}