import java.util.ArrayList;

/**
 * Décrivez votre classe Hero ici.
 *
 * @author (group 3)
 * @version (un numéro de version ou une date)
 */
public class Pikachu extends Pokemon
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Inventory inventory; 
    /**
     * Constructeur d'objets de classe Hero
     */
    public Pikachu(Attaque cap1, int pvMax, int vit, int attack)
    {
        // initialisation des variables d'instance
        super(cap1,pvMax,vit,attack);
        inventory = new Inventory();
    }
    
    public void augmentAtt(int attPlus){}
    
    public void augmentPv(int pvPlus){}
    
    public int getPv(){
        return(pvReal);
    }
    
    public int getPvMax(){
        return(pvMax);
    }
    
    public void useBoost(){}
    
    public void eatBerry(){}

    public void addCapacity(){
        
    }

    
    }
