import java.util.ArrayList;

/**
 * Décrivez votre classe Level ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Level
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
    public Level(int number)
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