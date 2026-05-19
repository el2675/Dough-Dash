
/**
 * This class animates the player movement
 *
 * @author (Ellen Li)
 * @version (May 15, 2026)
 */

//import java swing
import javax.swing.*;

//import java awt event 
import java.awt.event.*;


public class Animation extends JPanel
{
    //instance variables
    short x, y, destX, destY;
    
    //constructor
    Animation(short x, short y, short destX, short destY){
        //set the variables
        this.x = x;
        this.y = y;
        this.destX = destX;
        this.destY = destY;
    }
}