
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

//import java awt image for icons
import java.awt.Image;

//import java awt
import java.awt.*;


public class GUI extends JFrame
{
    //declare instance variables
    // JFrame frame;
    JLabel playerIcon;
    JLabel score;
    
    //create a constructor for the GUI
    GUI(Map map, Driver driver, Player player){
        //title the JFrame
        this.setTitle("Dough Dash");
        
        //set the frame size
        this.setSize(1200, 800);
    
        //set layout
        this.setLayout(null);
        
        
        //create new custom colours
        Color colDelivered = new Color(213, 255, 171);
        Color colWaiting = new Color(255, 81, 23, 127);
        
        //create layered pane to layer the components properly
        JLayeredPane layers = this.getLayeredPane();
        
        
        //create and add label for player score 
        this.score = new JLabel("Score: "+ Short.toString(player.shrScore));
        this.score.setBounds(20, 20, 1000, 10);
        
        //add the score label to the layered pane
        layers.add(score, JLayeredPane.DEFAULT_LAYER);
        
    
        //draw lines between buttons
        LineDrawing lines = new LineDrawing(map);
        lines.setBounds(0, 0, 1200, 800);
        
        //add the lines to a bottom layer
        layers.add(lines, JLayeredPane.DEFAULT_LAYER);
        
        //create the timer
        timer();
        
        //create the buttons
        createButtons(map, player, driver, colDelivered, score, colWaiting);
        
        
        //create the player icon
        createPlayer(player);
        

        //set visibility
        this.setVisible(true);
        this.revalidate();
        this.repaint();
    }
    
    
    //create a method for a timer to keep track of the game time
    public void timer(){
        //create a variable to track time
        int intTime = 0;
        
        //create a jlabel for the time
        JLabel time = new JLabel("Time: " + Integer.toString(intTime));
        
        //set bounds for the jlabel
        time.setBounds(20, 20, 1000, 50);
        
        //add the JLabel to the screen
        this.getLayeredPane().add(time, JLayeredPane.MODAL_LAYER);   
        
        //create a timer
        Timer gameTime = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //set timer to update the timer label every second
                time.setText("Time: " + Integer.toString(intTime+1));
            }
        });
        
        //start the timer
        gameTime.start();
    }
    
    //create a method for action listener
    public void onClick(Location location, Player player, short x, short y, JButton btn, Map map, Driver driver, Color delivered, JLabel score){
        //move player to the location if the current location is connected to the destination
        driver.move(location, player, map, this.playerIcon);
        
        
        
        //find coordinates of the player
        short shrX = player.shrX;
        short shrY = player.shrY;

        // //move the player icon to the same location as the player
        // // this.playerIcon.setLocation(shrX, shrY);
        // Animation a = new Animation(this.playerIcon, location);
        
        //move the player icon to the same location as the player
        this.playerIcon.setLocation(shrX, shrY);
        
        //update the waiting for order variable
        if (location instanceof House){
            ((House)location).setWait();
        }
        
        //update the score
        score.setText("Score: "+ Short.toString(player.shrScore));
        
        
        //change to display that house was visited
        if (player.shrX == location.shrXCoordinate && player.shrY == location.shrYCoordinate){
            if (location instanceof House){
                //set the background color
                // btn.setContentAreaFilled(true);
                btn.setBackground(delivered);
            }
        }
        
    }
    
    //create a method to make a player icon
    public void createPlayer(Player player){
        //import the image into an icon
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/playericon.png"));

        //extract the image
        Image img = icon.getImage();
        
        //scale the image
        Image scaledImg = img.getScaledInstance(70, 70, Image.SCALE_SMOOTH);

        //create a new icon for the scaled image
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        
        //set the instance variables for the player icon
        this.playerIcon = new JLabel(scaledIcon);
        this.playerIcon.setBounds(100, 100, player.shrX, player.shrY);
        this.playerIcon.setOpaque(false);
        
        //add the player icon to the frame
        this.getLayeredPane().add(playerIcon, JLayeredPane.MODAL_LAYER);
        
    }
    
    
    //create method to make buttons
    public void createButtons(Map map, Player player, Driver driver, Color colDelivered, JLabel score, Color colWaiting){
        //create a button for each location
        for(byte i = 0; i < map.numLocations(); i++){
                   
            //find the current location
            Location location = map.getLocation(i);
            
            //declare a jbutton 
            JButton btn;
            
            //create icon for store and house
            ImageIcon icon = new ImageIcon(getClass().getResource("/Images/house.png"));
            
            //extract the image
            Image img = icon.getImage();
        
            //scale the image
            Image scaledImg = img.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            
            
            //create a new icon for the scaled image
            ImageIcon houseIcon = new ImageIcon(scaledImg);
            
            //create button
            if(location instanceof House){
                btn = new JButton(location.strName, houseIcon);
                
                //set button background to red to show that the house requires delivery
                btn.setBackground(colWaiting);
                
                //set button background to transparent
                // btn.setContentAreaFilled(false);
                // btn.setOpaque(false);
                // btn.setBorderPainted(false);
            }
            else{
                btn = new JButton(location.strName);
                
                //set store background
                btn.setBackground(Color.WHITE);
            }
            
            //declare coordinate variables to hold the position on the current location
            short x = location.shrXCoordinate;
            short y = location.shrYCoordinate;
            
            //create a label for the locations and add to screen
            JLabel buttonLabel = new JLabel(location.strName);
            buttonLabel.setBounds((x+30), (y-15), 50, 20);
            this.getLayeredPane().add(buttonLabel, JLayeredPane.MODAL_LAYER);
            
            
            
            //set button position and size on map
            btn.setBounds(x, y, 80, 80);
            
            //add an on-click action listener to the buttons
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    //call on-click method
                    onClick(location, player, (short)(x + 5), (short)(y + 5), btn, map, driver, colDelivered, score);
                }
            });
            
            
            //add buttons to the layered pane
            this.getLayeredPane().add(btn, JLayeredPane.PALETTE_LAYER);
            
        }
    }

    
}

