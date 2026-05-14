
/**
 * This class creates a player object.
 *
 * @author (Domero Omoigbedi)
 * @version (5/8/2026)
 */
public class Player
{
    //Declare variables of type byte to hold the location relevant coordinates and location info of the player
    byte bytX, bytY, bytLocation;
    
    //Declare variables of type byte to hold players relevant score information such as completed deliveries and overall score
    byte bytNumDeliveries;
    short shrScore;
    
    
    //This is a constructor for the player class
    Player(byte x, byte y, byte deliveries, byte score)
    {
        this.bytX = x;
        this.bytY = y;
        this.bytNumDeliveries = deliveries;
        this.shrScore = score;
    
        //start at store location
        this.bytLocation = 0;
    }

    
    
    //Returns if the player has won (they win if they have made all their deliveries and are at the store)
    public boolean checkWin()
    {
        return bytNumDeliveries == 0 && bytLocation == 0;
    }
    
    
    //Updates the player’s location and X and Y coordinates
    public void move(byte bytLocation, byte bytX, byte bytY)
    {
        this.bytLocation = bytLocation;
        this.bytX = bytX;
        this.bytY = bytY;
    }
}
    
