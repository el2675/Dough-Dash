
/**
 * This class draws lines
 *
 * @author (Ellen Li)
 * @version (May 14, 2026)
 */

//import java swing for GUI
import javax.swing.*;

//import java awt for graphics
import java.awt.*;

public class LineDrawing extends JPanel
{
    //create instance variables
    int x1, y1, x2, y2;
    
    LineDrawing(int x1, int y1, int x2, int y2){
        //set the variables
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
    }
    
    
    //method for the line drawing
    @Override
    public void paintComponent(Graphics g){
        //call super constructor
        super.paintComponent(g);
        
        //set the line color
        g.setColor(Color.BLACK);
        
        //draw the line
        g.drawLine(x1, y1, x2, y2);
    }

}