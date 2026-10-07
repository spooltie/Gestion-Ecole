public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected String age;
    protected String email;

    public Personne(String nom, String prenom, String age, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
    }

    public void getBaseDesc(){

    }
    public void printDesc(){

    }
    public abstract void getRole();
}
