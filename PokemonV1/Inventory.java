import java.util.ArrayList;
/**
 * Permet de stocker la liste des objet ramasser
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Inventory
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private ArrayList <Objet> Objets;
    

    /**
     * Constructeur d'objets de classe Inventaire
     */
    public Inventory()
    {
        // initialisation des variables d'instance
        Objets=new ArrayList<Objet>();
    }
    
    public void add(Objet theObjet)//ajouter un objet dans l'inventaire
    {
        Objets.add(theObjet);
    }
    
    public void delete(Objet theObjet)//supprime un objet de l'inventaire
    {
        Objets.remove(theObjet);
    }
    
    public Objet showList()//affiche les objets qui sont dans l'inventaire
    {
        for(int i = 0; i < Objets.size(); i++) 
    {
        Objet Objet = Objets.get(i);  
        {
            return Objets.get(i);
        }
    }
    return null;
    }
}