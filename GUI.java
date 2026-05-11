
/**
 * This class creates the GUIs of the game
 *
 * @author (Ellen Li)
 * @version (May 8, 2026)
 */

//import java swing for GUI
import javax.swing.*;

//import arraylist
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener
{
    //create a constructor for the GUI
    GUI(){
        //title the JFrame
        this.setTitle("Dough Dash");
        
        //set the frame size
        this.setSize(600, 400);
        
        //create arraylist of buttons
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        
        //create a button for each location
        for(byte i = 0; i < numLocations(); i++){
            //create a JButton 
            buttons.add(new JButton());
            
            //set button position on map
            locations.get(i).bytXCoordinate;
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //create a button for reset
        JButton replay = new JButton("Play Again");
        replay.add(rerun);
        this.add(replay);
        
    }
    
    //create method for action listener
    @Override
    public void onCLick(ActionEvent e){
        //check if the house was waiting for order
        
    }
    
    
    
    
    
    //create a method to rerun the game
    @Override
    public void rerun(ActionEvent e){
        //run the reset method
        driver.reset();
    }
    
}