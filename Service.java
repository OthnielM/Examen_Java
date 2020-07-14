public class Service implements IService {
    
    //Taille Reservation :nbre Cellule du Tableau
    final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
    private int nbreEmploye=0;//nbre Classe dans le tableau, mais aussi la position d'insertion
    private int nbreEmbauche = 0;
    private int nbreService = 0;
    //Declaration des Tableaux
    private Employe [] tabEmploye;
    private Embauche [] tabEmbauche;

    private Service [] tabService;

    private int count;
    this.count = 0;
    private int id;
    private String libelle;

    public Service(){
        //Creation du Tableau
        this.tabEmploye=new Employe[TAILLE];
    }

    @Override
    public String affiche(){
        return "Id: "+this.id+" Libelle : "+this.libelle;
    }

    private int generateId(){
        return this.count++;
    }

    public compare(int id){

    }

    public compare(String libelle){
        
    }

    public void ajouterEmploye(Employe employe){
        if(nbreEmploye < TAILLE){
        this.tabEmploye[nbreEmploye]=employe;
        this.nbreEmploye++;
        }  else {
            System.out.println("tableau rempli");
        }
    }

    public void ajouterService(Service service){
        if(nbreService < TAILLE){
        this.tabService[nbreService]=service;
        this.nbreService++;
        } else {
            System.out.println("tableau rempli");
        }
    }

    public void listerService(){
        for(int i = 0; i<TAILLE; i++){
            System.out.println(tabService[i]);
        }
    }



}