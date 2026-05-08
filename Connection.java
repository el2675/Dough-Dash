
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
    byte bytIndex;
    byte bytTravelTime;
    
    Connection(byte i, byte tt){
        this.bytIndex = i;
        this.bytTravelTime = tt;
    }
    
    
}