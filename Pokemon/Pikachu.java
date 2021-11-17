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
    
    /**
     * Method that augment attack for a int amount
     */
    public void augmentAtt(int attPlus){}
    
    /**
     * Method that augment pvMax for a int amount
     */
    public void augmentPv(int pvPlus){}
    
    /**
     * Method to use a boost from the inventory 
     * check the inventory, and modify the attack or pvMax attributes
     */
    public void useBoost(){}
    
    /**
     * Method to use a berry, special
     */
    public void eatBerry(){}

    public void addCapacity(Attaque newcap){
        
    }

    
    }
