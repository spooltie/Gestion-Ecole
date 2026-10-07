import java.util.ArrayList;

public class Ecole {
    private ArrayList <Personne> listePersonne = new ArrayList<Personne>();

    public void listerPersonnes(){
     for (Personne p:listePersonne){
         System.out.println(p.getBaseDesc());
     }
    }
    public void ajouterPersonne(Personne p){
        this.listePersonne.add(p);
    }
}
