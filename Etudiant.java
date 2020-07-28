import java.time.LocalDate;
import java.time.Period;
public abstract class Etudiant implements IEtudiant{

   //Auto généré
    protected int matricule;
    protected  String nomComplet;
    protected  LocalDate dateNaiss;
    private static int count;

    public Personne (String nomComplet,
               String dateNaiss){
      this.nomComplet=nomComplet;
      this.dateNaiss=LocalDate.parse(dateNaiss);
     //Initialisé Matricule
       this.matricule = assignMatricule();

    }

      public Etudiant (){
        //Initialisé Matricule
       this.matricule = assignMatricule();
    }

   //Getters and Setters
	public int getMatricule(){
		return this.matricule;
	}
	public void setMatricule(int matricule){
		this.matricule = matricule;
	}

	public String getNomComplet(){
		return this.nomcomplet;
	}
	public void setNomComplet(String nomComplet){
		this.nomcomplet = nomComplet;
	}
     
	public LocalDate getDateNaiss(){
		return this.dateNaiss;
	}
	public void setDateNaiss(String dateNaiss){
		this.dateNaiss = LocalDate.parse(dateNaiss);
	}

	


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Matricule: "+matricule+" Nom et Prenom : "+nomComplet+" Date de naissance: "+ this.dateNaissance.toString();
    }

   Personne.count = 0;
   private static int assignMatricule(){
       Personne.count++;
       return Main.count;
   }

}