
/**
 * This class creates a timer object for the GUI
 *
 * @author (Ellen Li)
 * @version (May 15, 2026)
 */

//import java awt event for the action listener
import java.awt.event.*;

public class Timer extends Object
{
    //create instance variables
    int intDelay;
    ActionListener action;
    
    // create constructor
    Timer(ActionListener a){
        //set a delay for 200 milliseconds
        this.intDelay = 200;
        this.action = a;
        
    }
}