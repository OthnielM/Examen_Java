public abstract class Employe implements IService {
    
    // Proprietes
    private int count;
    this.count = 0;
    protected int id;
    protected String nomComplet;

    public Employe(){
        this.id = generateId();
    }

    public Employe(String nomComplet){
        this.nomComplet = nomComplet;
        this.id = generateId(); // Ecrire une fonction generateId() qui genere un id unique
    }

    public String getNomComplet(){
        return this.nomComplet;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }

    public int getId(){
        return this.id;
    }


    @Override
    public String affiche(){
        return "Id: "+this.id+" Nom et Prenom : "+this.nomComplet;
    }

    public Boolean isEmbauche(){
        
    }
    public Boolean isJournalier(){
        
    }

    private int generateId(){
        return this.count++;
    }

}