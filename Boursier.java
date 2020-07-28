import java.time.LocalDate;
public class Boursier extends Etudiant{

    private String type;
    private int mnt;

    //Propriété navigationnelle
     private Classe  classeBour;
   
    //Constructeur
       //Par defaut
           public Boursier(){
	super();
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Etudiant(String nomComplet,
               String dateNaiss,String tuteur,int mnt ){
            //Initialisation de la personne
              super(nomComplet,dateNaiss);
             this.type=type;
             this.mnt=mnt;
          }

   //Getters and Setters
      public String getType(){
	return this.type;
      }
      public void setType(String type){
	this.type = type;
      }
      public String getMnt(){
	return this.mnt;
      }
      public String setMnt(String mnt){
	this.mnt = mnt;
      }
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie etudiant
    //this signifie boursier
       return super.affiche() +" Type : "+type 
                     +" Mnt "+mnt;
    }

}