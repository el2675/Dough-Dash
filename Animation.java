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
    short shrX, shrY, shrDestX, shrDestY;
    float fltDistX, fltDistY;
    byte bytFrames;
    
    Animation(JLabel player, Location clicked){
        this.bytFrames = 60;
        
        //set instance variables
        this.shrX = (short)player.getX();
        this.shrY = (short)player.getY();
        
        this.shrDestX = (short)clicked.shrXCoordinate;
        this.shrDestY = (short)clicked.shrYCoordinate;
        
        
        //calculate the distance to move per frame
        this.fltDistX = ((this.shrDestX - this.shrX)/this.bytFrames);
        this.fltDistY = ((this.shrDestY - this.shrY)/this.bytFrames);
        
        
        //create a timer
        Timer timer = new Timer(16, new ActionListener(){
            
            //set the current frame
            byte bytCurrentFrame = 0;
            
            //action performed method to animate the moving player
            @Override
            public void actionPerformed(ActionEvent e){
                //change the location based on the frame
                if(bytCurrentFrame < bytFrames){
                    //declare new locations
                    short shrNewX = (short)(shrX + fltDistX*bytCurrentFrame);
                    short shrNewY = (short)(shrY + fltDistY*bytCurrentFrame);
                    
                    //set player location
                    player.setLocation(shrNewX, shrNewY);
                    
                    //change the frame
                    bytCurrentFrame++;
                }
                else{
                    //set the player to the final destination
                    player.setLocation(shrDestX, shrDestY);

                    //end the timer when the final position is reached
                    ((Timer)e.getSource()).stop();
                }
            }
        });
        
        //start the timer
        timer.start();
    }
    
    
}
