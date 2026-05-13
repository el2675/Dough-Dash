
/**
 * This class drives the main logic of the game
 *
 * @author (Ellen Li, Kevin Sander)
 * @version (May 8, 2026)
 */
public class Driver
{
    //declare instance variables to store the game time
    long lngGameTime;
    long lngStartTime;
    
    //create a default constructor for the driver class
    Driver(){
        //set the game start time
        this.lngStartTime = System.currentTimeMillis();
    }
    
    //create a method to run the main logic of the game
    public void run(){
        //create a map with twelve locations
        Map map = new Map((byte)12);
        
        //create player at the store with 3 deliveries
        Player player = new Player(map.getLocation((byte)0).bytXCoordinate, map.getLocation((byte)0).bytXCoordinate, (byte)3, (byte)0);
        
        //create the general user interface (GUI)
        GUI gui = new GUI(map, this);
    }
    
    //create a method to reset the game
    public void reset(){
        this.run();        
    }
    
    
    //create a method to update the game time
    public void updateTime(){
        //set the game time to be the current game time
        this.lngGameTime = System.currentTimeMillis() - this.lngStartTime;
    }
}