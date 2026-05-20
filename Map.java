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
          locations.add(new House("A", (byte)1, false));
          locations.add(new House("B", (byte)2, false));
          locations.add(new House("C", (byte)3, true));
          locations.add(new House("D", (byte)4, false));
          locations.add(new House("E", (byte)5, false));
          locations.add(new House("F", (byte)6, true));
          locations.add(new House("G", (byte)7, false));
          locations.add(new House("H", (byte)8, false));
          locations.add(new House("I", (byte)9, false));
          locations.add(new House("J", (byte)10, true));
          locations.add(new House("K", (byte)11, false));
    
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
        //Store
        locations.get(0).shrXCoordinate = 550;
        locations.get(0).shrYCoordinate = 550;
    
        //Housesa through k
        //Assign x and y coordinates to house A
        locations.get(1).shrXCoordinate = 400;
        locations.get(1).shrYCoordinate = 450;
        
        //Assign x and y coordinates to house B
        locations.get(2).shrXCoordinate = 300;
        locations.get(2).shrYCoordinate = 275;
    
        //Assign x and y coordinates to house C
        locations.get(3).shrXCoordinate = 265;
        locations.get(3).shrYCoordinate = 150;
    
        //Assign x and y coordinates to house D
        locations.get(4).shrXCoordinate = 370;
        locations.get(4).shrYCoordinate = 140;
    
        //Assign x and y coordinates to house E
        locations.get(5).shrXCoordinate = 425;
        locations.get(5).shrYCoordinate = 265;
    
        //Assign x and y coordinates to house F
        locations.get(6).shrXCoordinate = 465;
        locations.get(6).shrYCoordinate = 50;
    
        //Assign x and y coordinates to house G
        locations.get(7).shrXCoordinate = 560;
        locations.get(7).shrYCoordinate = 150;
        
        //Assign x and y coordinates to house H
        locations.get(8).shrXCoordinate = 700;
        locations.get(8).shrYCoordinate = 145;
    
        //Assign x and y coordinates to house I
        locations.get(9).shrXCoordinate = 825;
        locations.get(9).shrYCoordinate = 255;
    
        //Assign x and y coordinates to house J
        locations.get(10).shrXCoordinate = 590;
        locations.get(10).shrYCoordinate = 335;
        
        //Assign x and y coordinates to house K
        locations.get(11).shrXCoordinate = 700;
        locations.get(11).shrYCoordinate = 425;
    

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