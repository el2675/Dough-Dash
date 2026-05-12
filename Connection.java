
/**
 * Defines a connection between two locations with an 
 * index and travel time. The index is used to access
 * a location through locations in the map.
 *
 * Kevin Sander
 * May 8th, 2026
 */
public class Connection
{
    //declare instance variables
    
    //declare variable for the index
    //of the other location in the
    //locations array list
    byte bytIndex;
    
    //declare variable for the travel
    //time between the connected 
    //locations
    byte bytTravelTime;
    
    //define constuctor
    Connection(byte i, byte tt){
        this.bytIndex = i;
        this.bytTravelTime = tt;
    }
}