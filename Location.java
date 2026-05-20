
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
        //add connections based on the name
        switch(this.strName){
            case "Store":
                //add the connections
                this.connectedLocations.add(new Connection((byte)1, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)10, (byte)((Math.random() * 8) + 1)));
                break;
            case "A":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)10, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)0, (byte)((Math.random() * 8) + 1)));
                break;    
            case "B":
                //add the connections
                this.connectedLocations.add(new Connection((byte)1, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)3, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)5, (byte)((Math.random() * 8) + 1)));
                break;   
            case "C":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)4, (byte)((Math.random() * 8) + 1)));
                break;   
            case "D":
                //add the connections
                this.connectedLocations.add(new Connection((byte)3, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)5, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)6, (byte)((Math.random() * 8) + 1)));
                break;   
            case "E":
                //add the connections
                this.connectedLocations.add(new Connection((byte)4, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)2, (byte)((Math.random() * 8) + 1)));
                break;   
            case "F":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)4, (byte)((Math.random() * 8) + 1)));
                break;   
            case "G":
                //add the connections
                this.connectedLocations.add(new Connection((byte)6, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)8, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)10, (byte)((Math.random() * 8) + 1)));
                break;   
            case "H":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)10, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)9, (byte)((Math.random() * 8) + 1)));
                break;   
            case "I":
                //add the connections
                this.connectedLocations.add(new Connection((byte)8, (byte)((Math.random() * 8) + 1)));
                break;   
            case "J":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)8, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)11, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)0, (byte)((Math.random() * 8) + 1)));
                this.connectedLocations.add(new Connection((byte)1, (byte)((Math.random() * 8) + 1)));
                break;   
            case "K":
                //add the connections
                this.connectedLocations.add(new Connection((byte)10, (byte)((Math.random() * 8) + 1)));
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