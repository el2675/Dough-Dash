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
          locations.add(new Store("Store", (byte)0));
          
          //add the houses to the arraylist 
          locations.add(new House("A", (byte)1));
          locations.add(new House("B", (byte)2));
          locations.add(new House("C", (byte)3));
          locations.add(new House("D", (byte)4));
          locations.add(new House("E", (byte)5));
          locations.add(new House("F", (byte)6));
          locations.add(new House("G", (byte)7));
          locations.add(new House("H", (byte)8));
          locations.add(new House("I", (byte)9));
          locations.add(new House("J", (byte)10));
          locations.add(new House("K", (byte)11));
    
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
    
    
    //This method will iterate through locations and assign each location x and y coordinates
    public void placeLocations()
    {
        short shrX = 100;
        short shrY = 100;
    
        //loop through every location
        for(Location location : locations)
        {
            //assign coordinates
            location.shrXCoordinate = shrX;
            location.shrYCoordinate = shrY;
    
            //move next location over
            shrX += 200;
    
            //if x gets too large go to next row
            if(shrX > 1000)
            {
                shrX = 150;
                shrY += 200;
            }
        }
    }

    //This method will iterate through locations and call connectLocations for each
    public void connectLocations()
    {
        //Using a for each loop to go through every location
        for(Location location : locations)
        {
            //initialize the arraylist
            location.connectedLocations = new ArrayList<Connection>();
    
            //call connectLocations method from Location class
            location.connectLocations(this);
        }
    }

}