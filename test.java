
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//import java swing for GUI
import javax.swing.*;

//import java awt for action listener
import java.awt.event.*;

//import java awt image for icons
import java.awt.image.*;

public class test
{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        
        frame.setLayout(null);
        
        //create player icon and label
        ImageIcon icon = new ImageIcon("D:/Ellen/GroupProject/pizza guy.jpg");
        JLabel playerIcon = new JLabel(icon);
        
        
        //add the player icon to the frame
        playerIcon.setBounds(20, 30, 400, 200);
        
        
        //player score 
        JLabel score = new JLabel("1");
        
        score.setBounds(40, 40, 600, 600);
        
        
        frame.add(score);
        
        // //create the buttons
        // createButtons(map, player);
        
        JButton a = new JButton("howr");
        a.setBounds(50, 50, 50, 50);
        frame.add(a);
        
        frame.setSize(1000, 500);
        
        //set visibility
        frame.setVisible(true);
        
        
    }
}