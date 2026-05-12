
/**
 * This is a superclass that provides subclasses with
 * the data and methods to handle being a location on
 * the map.
 *
 * Kevin Sander
 * May 11th, 2026
 */

//import array list
import java.util.ArrayList;

public class Location
{
    //declare instance vaiables
    
    String strName;
    ArrayList<Connection> connectedLocations;
    byte bytXCoordinate;
    byte bytYCoordinate;
    
    private String strAddress;
    
    //define constructor
    Location(String n, String address){
        this.strName = n;
        this.strAddress = address;
    }
    
    //define method to connect current location
    //to other locations
    //Note: this is hard codded currently
    //      ideally will be randomized eventually
    void connectLocations(Map map){
        //add connections based on the name
        switch(this.strName){
            case "A":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, (byte)7));
                this.connectedLocations.add(new Connection((byte)10, (byte)5));
                this.connectedLocations.add(new Connection((byte)0, (byte)2));
                break;    
            case "B":
                //add the connections
                this.connectedLocations.add(new Connection((byte)1, (byte)7));
                this.connectedLocations.add(new Connection((byte)3, (byte)1));
                this.connectedLocations.add(new Connection((byte)5, (byte)3));
                break;   
            case "C":
                //add the connections
                this.connectedLocations.add(new Connection((byte)2, (byte)1));
                this.connectedLocations.add(new Connection((byte)4, (byte)5));
                break;   
            case "D":
                //add the connections
                this.connectedLocations.add(new Connection((byte)3, (byte)5));
                this.connectedLocations.add(new Connection((byte)5, (byte)2));
                this.connectedLocations.add(new Connection((byte)6, (byte)2));
                break;   
            case "E":
                //add the connections
                this.connectedLocations.add(new Connection((byte)4, (byte)2));
                this.connectedLocations.add(new Connection((byte)2, (byte)3));
                break;   
            case "F":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)3));
                this.connectedLocations.add(new Connection((byte)4, (byte)2));
                break;   
            case "G":
                //add the connections
                this.connectedLocations.add(new Connection((byte)6, (byte)3));
                this.connectedLocations.add(new Connection((byte)8, (byte)8));
                this.connectedLocations.add(new Connection((byte)10, (byte)2));
                break;   
            case "H":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)8));
                this.connectedLocations.add(new Connection((byte)10, (byte)4));
                this.connectedLocations.add(new Connection((byte)9, (byte)5));
                break;   
            case "I":
                //add the connections
                this.connectedLocations.add(new Connection((byte)8, (byte)5));
                break;   
            case "J":
                //add the connections
                this.connectedLocations.add(new Connection((byte)7, (byte)2));
                this.connectedLocations.add(new Connection((byte)8, (byte)4));
                this.connectedLocations.add(new Connection((byte)11, (byte)3));
                this.connectedLocations.add(new Connection((byte)0, (byte)4));
                this.connectedLocations.add(new Connection((byte)1, (byte)5));
                break;   
            case "K":
                //add the connections
                this.connectedLocations.add(new Connection((byte)10, (byte)3));
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