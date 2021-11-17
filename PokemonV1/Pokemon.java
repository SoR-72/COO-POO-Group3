import java.util.ArrayList;

/**
 * Décrivez votre classe Pokemon ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public abstract class Pokemon
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    protected int attack;
    protected int pvReal;
    protected int pvMax;
    protected int vit;
    protected ArrayList<Attaque> capacities;
    /**
     * Constructeur d'objets de classe Pokemon
     */
    public Pokemon(Attaque cap1, int pvMax, int vit, int attack)
    {
        // initialisation des variables d'instance
        this.pvMax= pvMax;
        this.pvReal= pvMax;
        this.vit= vit;
        this.attack= attack;
        
        capacities = new ArrayList<Attaque>(); 
        capacities.add(cap1);        
    }
    
    
}
