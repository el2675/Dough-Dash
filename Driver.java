
/**
 * This class drives the main logic of the game
 *
 * @author (Ellen Li, Kevin Sander)
 * @version (May 8, 2026)
 */

//import JOptionPane for user input
import javax.swing.JOptionPane;

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
        Player player = new Player(map.getLocation((byte)0).shrXCoordinate, map.getLocation((byte)0).shrYCoordinate, (byte)3, (byte)0);
        
        //create the general user interface (GUI)
        GUI gui = new GUI(map, this, player);
    }
    
    //handles button clicks, this usually results in a move
    public void move(Location clickedLocation, Player player, Map map){
        //checking if the clicked location is connected
        //to the player's location
        
        //declare and initialize variable for
        //the player's location
        Location playerLocation = map.getLocation((byte)(player.bytLocation));
        
        //declare and initialize variable to
        //store the index the connected
        //location was found
        byte bytIndexConnected = -1;
        
        //loop through locations connected
        //to the player's location
        for(byte i = 0; i < playerLocation.connectedLocations.size(); i++){
            //check if current connection's index
            //matchs that of the clicked location
            if(playerLocation.connectedLocations.get(i).bytIndex == clickedLocation.bytIndex){
                //set bolConnected to reflect
                //that the connection was found
                bytIndexConnected = i;
                
                //exiting the loop because the 
                //connection was found
                break;
            }
        }
        
        //exit the method if a connection
        //was not found
        if(bytIndexConnected == -1){
            //exiting method
            return;
        }
        
        //move player
        player.move(clickedLocation.bytIndex, clickedLocation.shrXCoordinate, clickedLocation.shrYCoordinate);
        
        //debug print
        //System.out.println(bytIndexConnected);
        
        //update player score
        player.shrScore += playerLocation.connectedLocations.get(bytIndexConnected).bytTravelTime;
        
        //check if the clicked location
        //is a house waiting for and order
        if(clickedLocation instanceof House && ((House)clickedLocation).bolWaiting){
            //decrease player's number of
            //deliveries to relfect that
            //they just made a delivery
            player.bytNumDeliveries--;
            
            //update the house such that it
            //is no longer waiting for an order
            ((House)clickedLocation).bolWaiting = false;
        }
        
        //check for win
        if(player.checkWin()){
            //prompt user if they want to play
            //again
            if(JOptionPane.showConfirmDialog(null,"Do you want to play again?", "Yes or No", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                //reset the game
                this.reset();
            }
            
            //exit the program because the 
            //user does not want to play
            //again
            System.exit(0);
        }
    }
    
    //create a method to reset the game
    public void reset(){
        //start a new game
        this.run();        
    }
    
    
    //create a method to update the game time
    public void updateTime(){
        //set the game time to be the current game time
        this.lngGameTime = System.currentTimeMillis() - this.lngStartTime;
    }
}