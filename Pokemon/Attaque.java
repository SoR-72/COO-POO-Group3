
/**
 * Décrivez votre classe Attaque ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Attaque
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int damage;
    private String name;

    /**
     * Constructeur d'objets de classe Attaque
     */
    public Attaque(String name, int damage)
    {
        this.name = name;
        this.damage = damage;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie damage*/
    public int getDamage(){
        return this.damage;
    }//end method getDamage

    /**SET Method Propertie damage*/
    public void setDamage(int damage){
        this.damage = damage;
    }//end method setDamage

    /**GET Method Propertie name*/
    public String getName(){
        return this.name;
    }//end method getName

    /**SET Method Propertie name*/
    public void setName(String name){
        this.name = name;
    }//end method setName

//End GetterSetterExtension Source Code


}//End class