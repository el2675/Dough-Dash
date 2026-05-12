
/**
 * This class creates the GUIs of the game
 *
 * @author (Ellen Li)
 * @version (May 8, 2026)
 */

//import java swing for GUI
import javax.swing.*;

//import java awt for action listener
import java.awt.event.*;

//import arraylist
import java.util.ArrayList;

public class GUI extends JFrame
{
    //create a constructor for the GUI
    GUI(Map map, Driver driver){
        //title the JFrame
        this.setTitle("Dough Dash");
        
        //set the frame size
        this.setSize(600, 400);
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // //draw rectangle for houses
        // fillRect(x, y, 15, 15);
        
        // //draw line between connected houses
        // drawLine(x1, y1, x, y);
        
        //create a button for reset
        JButton replay = new JButton("Play Again");
        replay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                driver.reset();
            }
        });
        this.add(replay);
        
    }
    
    //create method for action listener
    public void onCLick(ActionEvent e){
        //check if the house was waiting for order
        
        //check if the house was waiting for order
        
        //move player to the class
        
        //update the waiting for order variable
        
        //change to display that house was visited
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //check if houses are connected
        //save the current house for comparison, possibly with a 2d array that stores the location, and the x and y coordinates
        /*if(arr.[i][1] == x && arr[i][2] == y)
        {
            byte index = i;
        }
        
        use locations arraylist:
        Location temp = Locations.get(i);
        for loop to loop through locations to check connection
        for (byte i = 0; i < connectedLocation(); i++){
            if (currentLocation == connectedLocations(i)){
                do something
            }
        }
            */
    }
    
    
    
    
    
    // //create a method to rerun the game
    // public void reset(ActionEvent e, Driver driver){
        // //run the reset method
        // driver.reset();
    // }
    
    //create method to make buttons
    public void createButtons(Map map){
        //create arraylist of buttons
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        
        //create a button for each location
        for(byte i = 0; i < map.numLocations(); i++){
            //create a JButton 
            buttons.add(new JButton());
            
            //set sizes of buttons
            buttons.get(i).setSize(50, 50);
                        
            
            //set button position on map
            //declare coordinate variables to hold the position on the current location
            int x = map.getLocation(i).bytXCoordinate;
            int y = map.getLocation(i).bytYCoordinate;
            
            
            
            
            
            for (byte j = 0; j < map.getLocation(i).connectedLocations.size(); j++){
                //find index of connected location
                byte index = map.getLocation(i).connectedLocations.get(j).bytIndex;
                
                //find coordinates of connected location

                
                //draw line between coordinates of current location and connected location
            
            }
                
            //store coordinates of previous location to draw a line between them
            /*
             * connected locations indexes:
             * for (byte j = 0; j < map.getLocation(I).connectedLocations.size()){}
             *     
             * 
             * if (map.getLocation(i).connectedLocations(j))
             */
            
            //set location of the button
            buttons.get(i).setLocation(x, y);
            
        }
    }
    
    
    
    
    
    
}