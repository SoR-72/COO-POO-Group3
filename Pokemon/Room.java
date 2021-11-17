import java.util.HashMap;
import java.util.Set;

/**
 * This class permits to create a "Room". A room is one location in 
 * game and it is connected to other rooms via exits. The exists are 
 * labelled north, east, south, west. For each direction, the room 
 * stores a reference to the neighboring room, or null if there is 
 * no exit in that direction.
 *
 * @author (Group3)
 * @version (version1)
 */
public class Room
{
    // INSTANCES VARIABLES
    // Description of the room :
    private String description;
    
    // The level the room must be :
    private int level;
    
    // The collectable item in the room :
    private Objet objet;
    
    // Enemy entity present in the room:
    private Ennemi enemy;
    
    // PNJ entity present in the room, the trader : 
    private NPC Yoda;
    
    // HashMap composed of the various exits rooms of the current room
    // (String : direction, Room : the exit room)
    private HashMap<String, Room> exits;
    
    // HashMap composed of the various doors to the respective exits of the current room
    // (ExitDoor : lock on the door ; Room : the specific room where there is a lock)
    private HashMap<ExitDoor, Room> blockedExits;
    
    // So if we want to pass a door, we will need to check the blockedExits hashmap
    
    /**
     * Object constructor of the class Room : 
     * Create a room described by its "description". Initially, it 
     * has no exits. "description" is something like "first level" or
     * "second level".
     */
    public Room(String description)
    {
        // Initialisation of the description
        this.description = description;
        
        //Initialisation of the Hashmap
        exits = new HashMap<>();
    }

    /**
     * Method getExit: returns the room that we reach in the given direction
     * If there is no room in that direction, returns null
     *
     * @param direction The exit's direction
     * @return The roomin the given direction
     * 
     * @version version 2021
     */
    public Room getExit(String direction){
            return exits.get(direction);
    }
    
    /**
     * Method setExit: defines an exit from this room
     * Replaces the setExits method
     *
     * @param direction the direction of the exit
     * @param neighbor the room in the given direction

     * @version version 2021
     */
    public void setExit(String direction, Room nextRoom){
            exits.put(direction, nextRoom);
    }
    
    /**
     * Method getExitString : store all the exist of the current room
     * in a String and returns it
     * 
     * @version version 2021 
     */
    public String getExitString(){
        String returnString = "Exits :";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    
    /**
     * Method getLevel : return the description of the current
     * Room
     * 
     * @return The description of the room.
     */
    public int getLevel()
    {
        return level;
    }
    
    /**
     * Method getDescription : return the description of the current
     * Room
     * 
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Method getLongDescription : return the long description of 
     * the current Room (print description + all the exits)
     * 
     * @return The description and the exits of the room.
     */
    public String getLongDescription()
    {
        return ("You are : " +getDescription() +", Level "+getLevel()+"\n" + getExitString());
    }
}
