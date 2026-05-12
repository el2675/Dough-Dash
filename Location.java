
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
        
        switch(this.strName){
            case "A":
                this.connectedLocations.add(new Connection((byte)2, (byte)7));
                this.connectedLocations.add(new Connection((byte)10, (byte)5));
                this.connectedLocations.add(new Connection((byte)0, (byte)2));
                break;    
            case "B":
                this.connectedLocations.add(new Connection((byte)1, (byte)7));
                this.connectedLocations.add(new Connection((byte)3, (byte)1));
                this.connectedLocations.add(new Connection((byte)5, (byte)3));
                break;   
            case "C":
                this.connectedLocations.add(new Connection((byte)2, (byte)1));
                this.connectedLocations.add(new Connection((byte)4, (byte)5));
                break;   
            case "D":
                this.connectedLocations.add(new Connection((byte)3, (byte)5));
                this.connectedLocations.add(new Connection((byte)5, (byte)2));
                this.connectedLocations.add(new Connection((byte)6, (byte)2));
                break;   
            case "E":
                this.connectedLocations.add(new Connection((byte)4, (byte)2));
                this.connectedLocations.add(new Connection((byte)2, (byte)3));
                break;   
            case "F":
                this.connectedLocations.add(new Connection((byte)7, (byte)3));
                this.connectedLocations.add(new Connection((byte)4, (byte)2));
                break;   
            case "G":
                this.connectedLocations.add(new Connection((byte)6, (byte)3));
                this.connectedLocations.add(new Connection((byte)8, (byte)8));
                this.connectedLocations.add(new Connection((byte)10, (byte)2));
                break;   
            case "H":
                this.connectedLocations.add(new Connection((byte)7, (byte)8));
                this.connectedLocations.add(new Connection((byte)10, (byte)4));
                this.connectedLocations.add(new Connection((byte)9, (byte)5));
                break;   
            case "I":
                this.connectedLocations.add(new Connection((byte)8, (byte)5));
                break;   
            case "J":
                this.connectedLocations.add(new Connection((byte)7, (byte)2));
                this.connectedLocations.add(new Connection((byte)8, (byte)4));
                this.connectedLocations.add(new Connection((byte)11, (byte)3));
                this.connectedLocations.add(new Connection((byte)0, (byte)4));
                this.connectedLocations.add(new Connection((byte)1, (byte)5));
                break;   
            case "K":
                this.connectedLocations.add(new Connection((byte)10, (byte)3));
                break;   
            default:
                System.out.println("Something went wrong.");
            
        }
    }
    
    //define getter for the address
    String getAddress(){
        return strAddress;
    }
}