import java.time.LocalDate;
public class NonBoursier extends Etudiant{

    private String aide;
    private int adresse;

    //Propriété navigationnelle
     private Classe  classeBour;
   
    //Constructeur
       //Par defaut
           public NonBoursier(){
	super();
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public NonBoursier(String nomComplet,
               String dateNaiss,String adresse,int aide ){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.aide=aide;
             this.adresse=adresse;
          }

   //Getters and Setters
      public String getAide(){
	return this.aide;
      }
      public void setAide(String aide){
	this.aide = aide;
      }
      public String getAdresse(){
	return this.adresse;
      }
      public String setAdresse(String adresse){
	this.adresse = adresse;
      }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie etudiant
    //this signifie nonboursier
       return super.affiche() +" Aide : "+aide 
                     +" Adresse :"+adresse;
    }

}