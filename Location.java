
/**
 * This is a superclass that provides subclasses with
 * the data and methods to handle being a location on
 * the map.
 *
 * @author (Kevin Sander)
 * @version (May 11th, 2026)
 */

//import array list
import java.util.ArrayList;

public class Location
{
    //declare instance vaiables
    
    String strName;
    ArrayList<Connection> connectedLocations;
    short shrXCoordinate;
    short shrYCoordinate;
    
    byte bytIndex;
    
    private String strAddress;
    
    //define constructor
    Location(String n, String address, Byte index){
        this.strName = n;
        this.strAddress = address;
        this.bytIndex = index;
    }
    
    //define method to connect current location
    //to other locations
    void connectLocations(Map map){
        //creating temporary variables
        //for the distance between locations
        byte SA = (byte)((Math.random() * 8) + 1);
        byte SJ = (byte)((Math.random() * 8) + 1);
        byte AB = (byte)((Math.random() * 8) + 1);
        byte AJ = (byte)((Math.random() * 8) + 1);
        byte BC = (byte)((Math.random() * 8) + 1);
        byte BE = (byte)((Math.random() * 8) + 1);
        byte CD = (byte)((Math.random() * 8) + 1);
        byte DE = (byte)((Math.random() * 8) + 1);
        byte DF = (byte)((Math.random() * 8) + 1);
        byte FG = (byte)((Math.random() * 8) + 1);
        byte GH = (byte)((Math.random() * 8) + 1);
        byte GJ = (byte)((Math.random() * 8) + 1);
        byte HJ = (byte)((Math.random() * 8) + 1);
        byte HI = (byte)((Math.random() * 8) + 1);
        byte JK = (byte)((Math.random() * 8) + 1);
        
        //add connections based on the name
        switch(this.strName){
            case "Store":
                //add the connections
                this.connectedLocations.add(new Connection((byte)1, SA));
                this.connectedLocations.add(new Connection((byte)10, SJ));
                break;
            case "A":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, AB));
                this.connectedLocations.add(new Connection((byte)10, AJ));
                this.connectedLocations.add(new Connection((byte)0, SA));
                break;    
            case "B":
                //add the connections
                this.connectedLocations.add(new Connection((byte)1, AB));
                this.connectedLocations.add(new Connection((byte)3, BC));
                this.connectedLocations.add(new Connection((byte)5, BE));
                break;   
            case "C":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, BC));
                this.connectedLocations.add(new Connection((byte)4, CD));
                break;   
            case "D":
                //add the connections
                this.connectedLocations.add(new Connection((byte)3, CD));
                this.connectedLocations.add(new Connection((byte)5, DE));
                this.connectedLocations.add(new Connection((byte)6, DF));
                break;   
            case "E":
                //add the connections
                this.connectedLocations.add(new Connection((byte)4, DE));
                this.connectedLocations.add(new Connection((byte)2, BE));
                break;   
            case "F":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, FG));
                this.connectedLocations.add(new Connection((byte)4, DF));
                break;   
            case "G":
                //add the connections
                this.connectedLocations.add(new Connection((byte)6, FG));
                this.connectedLocations.add(new Connection((byte)8, GH));
                this.connectedLocations.add(new Connection((byte)10, GJ));
                break;   
            case "H":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, GH));
                this.connectedLocations.add(new Connection((byte)10, HJ));
                this.connectedLocations.add(new Connection((byte)9, HI));
                break;   
            case "I":
                //add the connections
                this.connectedLocations.add(new Connection((byte)8, HI));
                break;   
            case "J":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, GJ));
                this.connectedLocations.add(new Connection((byte)8, HJ));
                this.connectedLocations.add(new Connection((byte)11, JK));
                this.connectedLocations.add(new Connection((byte)0, SJ));
                this.connectedLocations.add(new Connection((byte)1, AJ));
                break;   
            case "K":
                //add the connections
                this.connectedLocations.add(new Connection((byte)10, JK));
                break;   
            default:
                //debug print
                System.out.println("Something went wrong.");
        }
    }
    
    //define getter for the address
    String getAddress(){
        return strAddress;
    }
}