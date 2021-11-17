import java.util.HashMap;
import java.util.ArrayList;

/**
 * The class "Etage" permits to create and manage the various levels of
 * the dungeon. A level is composed of multiple rooms (with a minimum 
 * of 5 rooms).
 *
 * @author (Group3)
 * @version (version1)
 */
public class Etage
{
    // INSTANCES VARIABLES
    // Number of the level (ex : level number 1)
    private int number;
    
    // Array composed of the various rooms in the level
    private ArrayList<Room> rooms;
    
    /**
     * Object constructor of the class Etage :
     * Create a level described by its "description". Initially, it 
     * has no exits. "description" is something like "first level" or
     * "second level".
     */
    public Etage(int number)
    {
        // Initialisation of the number for the level
        this.number = number;
        
        // Initialisation of the array list of rooms
        rooms = new ArrayList<Room>();
    }
    
    public ArrayList<Room> getArrayList(){
        return rooms;
    }
}
