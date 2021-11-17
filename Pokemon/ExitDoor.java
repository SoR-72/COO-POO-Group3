
/**
 * This class permits to create and manage doors of exits : locking,
 * unlocking them.
 *
 * @author (Group3)
 * @version (version1)
 */
public class ExitDoor
{
    // INSTANCES VARIABLES
    // Description of the room :
    private String description;
    
    // Boolean to know if the door is locked
    private boolean locked; //if true : it is locked ; false : unlocked

    /**
     * Object constructor of the class ExitDoor :
     * Create an exitDoor described by its "description". Initially, 
     * it is locked.
     */
    public ExitDoor(String description)
    {
        // Initialisation of the description
        this.description = description;
        
        // Initialisation of the lock value
        locked = false;
    }

    /**
     * Method getLocked : return the boolean of the current
     * door to know if it is locked or not
     * 
     * @return the boolean locked of the door
     */
    public boolean getLocked()
    {
        return locked;
    }
    
    /**
     * Method getDoorString : return the String of the door
     * 
     * @return the String of the door
     */
    public String getDoorString()
    {
        boolean lock = getLocked();
        
        if(lock==true){
            return ("You shall not pass ! This door is locked");
        }
        else{
            return ("This door is open");   
        }
    }
}