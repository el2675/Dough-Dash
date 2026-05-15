
/**
 * This class creates a house object that acts as a stopping point for the player when delivering pizza

.
 *
 * @author (Ellen Li)
 * @version (May 8, 2026)
 */
public class House extends Location
{
    //declare instance variables
    boolean bolWaiting;
    
    //constructor
    House(String n, Byte index, Boolean waiting){
        //call super constructor
        super(n, "", index);
        
        //set instance variable
        this.bolWaiting = waiting;
    }
    
    //set the waiting variables
    public void setWait(){
        this.bolWaiting = false;
        
    }

}