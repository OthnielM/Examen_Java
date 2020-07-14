import java.time.LocalDate;

public class Embauche extends Employe {
    
    //proprietes
    private int salaire;
    private LocalDate dateEmb;

    public Embauche(){
        super();
    }

    public Embauche(String nomComplet, int salaire, LocalDate dateEmb){
        super(nomComplet);
        this.salaire = salaire;
        this.dateEmb = dateEmb;
    }

    public int getSalaire(){
        return this.salaire;
    }
    public void setSalaire(int salaire){
        this.salaire = salaire;
    }

    public int getDateEmb(){
        return this.dateEmb;
    }
    public void setDateEmb(LocalDate dateEmb){
        this.dateEmb = dateEmb;
    }

    @Override
    public String affiche(){
       return super.affiche() +" Salaire : "+this.salaire+" Date d'embauche "+this.dateEmb;
    }
}