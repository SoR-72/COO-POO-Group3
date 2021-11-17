
/**
 * Extend of exit doors : doors that are locked with a lock.
 * A lock will be on this door and it can be unlock by a key. 
 *
 * @author (Group3)
 * @version (version1)
 */
public class LockedDoor extends ExitDoor
{
    // INSTANCES VARIABLES
    // Boolean to know if the door is locked
    private boolean locked; //if true : it is locked ; false : unlocked
    
    // The key needed to unlock the lock
    private Key key;

    /**
     * Object constructor of the class LockedDoor :
     * Create a LockedDoor described by its "description". Initially, 
     * it is locked.
     */
    public LockedDoor(String description)
    {
        // Calling the constructor of the base class (ExitDoor)
        super(description);
        
        // Initialisation of the lock value
        locked = false;
    }
    
    /**
     * Method unlock : permits to unlock the locked door
     * 
     * @change locked parameter to true
     */
    public void unlock()
    {
        this.locked=false;
    }
}

