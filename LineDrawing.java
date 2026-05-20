
/**
 * This class draws lines
 *
 * @author (Ellen Li)
 * @version (May 14, 2026)
 */


//import java swing for GUI
import javax.swing.*;

//import java awt font for custom font
import java.awt.Font;

//import java awt for graphics
import java.awt.*;

public class LineDrawing extends JPanel
{
    //create instance variables
    Map map;
    
    LineDrawing(Map map){
        //set the map instance variable
        this.map = map;
        
        //set up the panel
        this.setLayout(null);
        this.setOpaque(true);
        this.setBackground(Color.WHITE);
        
    }
    
    
    //method for the line drawing
    @Override
    public void paintComponent(Graphics g){
        //call super constructor
        super.paintComponent(g);
        
        //set the line color
        g.setColor(Color.BLACK);
        
        //loop through locations to draw lines between connected locations
        for(byte i = 0; i < map.numLocations(); i++){
            //create temporary location object to hold current location
            Location currentLocation = map.getLocation(i);
            
            //inner for loop to loop through the current locations connections
            for(byte j = 0; j < currentLocation.connectedLocations.size(); j++){
                //find index of connected location
                byte bytDestination = map.getLocation(i).connectedLocations.get(j).bytIndex;
                
                Location destination = map.getLocation(bytDestination);
                
                //draw a line betwen the buttons
                g.setColor(Color.BLACK);
                g.drawLine(currentLocation.shrXCoordinate + 25, currentLocation.shrYCoordinate + 25,
                destination.shrXCoordinate + 25, destination.shrYCoordinate + 25);
                
                
                //find point between the two locations
                short midX = (short)(((currentLocation.shrXCoordinate + 25) + (destination.shrXCoordinate + 25))/2);
                short midY = (short)(((currentLocation.shrYCoordinate + 25) + (destination.shrYCoordinate + 25))/2);
                
                //draw the travel time between locations with a different color and font
                Font font = new Font("Ariel", Font.BOLD, 20);
                g.setFont(font);
                g.setColor(Color.MAGENTA);
                g.drawString(Byte.toString(currentLocation.connectedLocations.get(j).bytTravelTime), midX, midY);

            }
        }
    }

}
