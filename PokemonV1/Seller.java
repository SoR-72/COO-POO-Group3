import java.util.HashMap; // import the HashMap class
/**
 * Décrivez votre classe Seller ici.
 *
 * @author (Arthur MESLIN)
 * @version (16/11/2021)
 */
public class Seller extends NPC
{
    private HashMap<String, String> exchange = new HashMap<String, String>(); // hashmap with couple treasure/capacities
    /**
     * Constructeur d'objets de classe Marchand
     */
    public Seller(String name, String description)
    {
        super(name, description);
        exchange.put("Ring", "Queue_de_fer");
    }
    
    /**
     * Méthode trade
     *
     * @param treasure treasure given to the seller
     * @return the capacity corresponding to the parameter according to the hashmap
     */
    public String getCapacity(String treasure){
      return exchange.get(treasure);
      
    }

}