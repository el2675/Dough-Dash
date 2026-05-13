import java.util.ArrayList;
/**
 * This class handles the generation of the map and holds this data to be accessed later.
 *
 * @author (Domero Omoigbedi)
 * @version (5/8/2026)
 */
public class Map
{
    private ArrayList<Location> locations;
    
    //This constructor will populate locations with a number of locations equal to bytNumLocations
    Map(byte bytNumLocations)
    {
          locations = new ArrayList<Location>();
          
          //add a new store to the map
          locations.add(new Store("Store"));
          
          //add the houses to the arraylist 
          locations.add(new House("A"));
          locations.add(new House("B"));
          locations.add(new House("C"));
          locations.add(new House("D"));
          locations.add(new House("E"));
          locations.add(new House("F"));
          locations.add(new House("G"));
          locations.add(new House("H"));
          locations.add(new House("I"));
          locations.add(new House("J"));
          locations.add(new House("K"));
    
          placeLocations();
          connectLocations();

    }
    
    //Returns the location at the specified index
    public Location getLocation(byte bytIndex)
    {
        return locations.get(bytIndex);
    }    
    
    //Returns the number of locations
    public byte numLocations()
    {
        return (byte)locations.size();
    }
    
    public void placeLocations()
    {
        byte bytX = 50;
        byte bytY = 50;
    
        //loop through every location
        for(Location location : locations)
        {
            //assign coordinates
            location.bytXCoordinate = bytX;
            location.bytYCoordinate = bytY;
    
            //move next location over
            bytX += 75;
    
            //if x gets too large go to next row
            if(bytX > 400)
            {
                bytX = 50;
                bytY += 75;
            }
        }
    }


    
    
    //This method will iterate through locations and call connectLocations for each
    public void connectLocations()
    {
        //Using a for each loop to go through every location
        for(Location location : locations)
        {
            //initialize the arraylist first
            location.connectedLocations = new ArrayList<Connection>();
    
            //call connectLocations method from Location class
            location.connectLocations(this);
        }
    }

       
}