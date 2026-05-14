
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
    GUI(Map map, Driver driver, Player player){
        //title the JFrame
        this.setTitle("Dough Dash");
        
        //set the frame size
        this.setSize(1200, 800);
    
        //set layout
        this.setLayout(null);
        
        //set visibility
        this.setVisible(true);        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
        //create a button for reset
        JButton replay = new JButton("Play Again");
        replay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                driver.reset();
            }
        });
        this.add(replay);
        
        
        //create the buttons
        createButtons(map, player);
    }
    
    //create method for action listener
    public void onClick(Location location, Player player, int x, int y){
        //check if the house was waiting for order
                
        //move player to the location
        player.move((byte)0, (byte)x, (byte)y);
        
        //update the waiting for order variable
        if (location instanceof House){
            ((House)location).setWait();
        }
        
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
    
    
    
    //create method to make buttons
    public void createButtons(Map map, Player player){
        //create arraylist of buttons
        // ArrayList<JButton> buttons = new ArrayList<JButton>();
        
        //create a button for each location
        for(byte i = 0; i < map.numLocations(); i++){
            // //create a JButton 
            // buttons.add(new JButton());
            
            // //set sizes of buttons
            // buttons.get(i).setSize(50, 50);
                        
            
            //find the current location
            Location location = map.getLocation(i);
            
            //create button
            JButton btn = new JButton(location.strName);
                        
            
            //declare coordinate variables to hold the position on the current location
            int x = location.bytXCoordinate;
            int y = location.bytYCoordinate;
            
            //set button position and size on map
            btn.setBounds(x, y, 50, 50);
            
            //add an on-click action listener to the buttons
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    //call on-click method
                    onClick(location, player, x, y);
                }
            });
            
            
            //draw line between connected buttons
            for (byte j = 0; j < map.getLocation(i).connectedLocations.size(); j++){
                //find index of connected location
                byte index = map.getLocation(i).connectedLocations.get(j).bytIndex;
                
                //find coordinates of connected location
                int x2 = map.getLocation(index).bytXCoordinate;
                int y2 = map.getLocation(index).bytYCoordinate;
                
                //draw line between coordinates of current location and connected location
                this.add(new LineDrawing(x, y, x2, y2));
            }
                
            //store coordinates of previous location to draw a line between them
            /*
             * connected locations indexes:
             * for (byte j = 0; j < map.getLocation(I).connectedLocations.size()){}
             *     
             * 
             * if (map.getLocation(i).connectedLocations(j))
             */
            
            //add buttons to the frame
            this.add(btn);
            
        }
    }

    
}