/**
 * Class for non player character (passives). different of ennemi class.
 *
 * @author (Arthur Meslin)
 * @version (16/11/2021)
 */
public class NPC
{
     
    private String name; // Name of the non player character
    private String description; // A litlle text said by the npc

    /**
     * Constructeur d'objets de classe NPC
     */
    public NPC(String name, String description)
    {
        this.name = name;
        this.description = description;
        
    }
    
    
    /**
     * Méthode getName
     *
     * @return name
     */
    public String getName(){
        return name;
        
    }
    
    /**
     * Méthode getDescription
     *
     * @return description
     */
    public String getDescription(){
       return description;
       
    }
    
    
}