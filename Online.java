
/**
 * Write a description of class Online here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Online extends Multiplayer
{
    // instance variables - replace the example below with your own
    private String serverAddress;
    private int ping;
    private String sessionID;
    
    /**
     * Constructor for objects of class Online
     */
    public Online()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void connectToServer(String address)
    {
        // put your code here
        this.serverAddress = address;
    }
    
    public void disconnect()
    {
        System.out.println("Disconnected from server.");
    }
}