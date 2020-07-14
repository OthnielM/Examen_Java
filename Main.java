import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    


    public static void main(String[] args) {
    
        String choix;
             Scanner clavier=new Scanner(System.in);
             Service service =new Service();
            do {
        
                System.out.println("1-Ajout Service");
                System.out.println("2-Lister Services");
                System.out.println("3-Ajouter un employe");
                System.out.println("4-Lister les journaliers");
                System.out.println("5-Lister les embauches d'un service");
                System.out.println("6-Quitter");
                System.out.println("Faites votre choix");
                choix=clavier.nextLine();
                switch(choix){
                    case "1":
                    System.out.println("Entrer le libelle du service");
                       String libelle =clavier.nextLine();
                       
                    break;
        
                    case "2":
        
                    service.listerService();
                    break;
        
                    case "3":
                    System.out.println("Entrer le Nom Complet");
                    String nomComplet =clavier.nextLine();
                    System.out.println("Veuillez choisir : ");
                    System.out.println("1: Embauche ");
                    System.out.println("2: Journalier ");
                    String choix2 =clavier.nextLine();
                    while (choix2 < 1 && choix2 > 2) {
                        System.out.println("Veuillez choisir : ");
                        System.out.println("1: Embauche ");
                        System.out.println("2: Journalier ");
                        String choix2 =clavier.nextLine();
                    }
                    if(choix2 == "1"){
                        System.out.println("Entrer le salaire");
                        String salaire =clavier.nextLine();
                        System.out.println("Entrer la date d'embauche");
                        LocalDate dateEmb = LocalDate.now();

                        Embauche emb = new Embauche(nomComplet, salaire, dateEmb);
                        service.ajouterEmploye(emb);

                    } else if(choix2 == "2"){
                        System.out.println("Entrer la duree");
                        String forfait = clavier.nextDouble();
                        System.out.println("Entrer la duree");
                        int duree = clavier.nextInt();

                        Journalier jour = new Journalier(nomComplet, forfait, duree);
                        service.ajouterEmploye(jour);
                    }
        
                    case "5":
                    
                    break;
        
                }
                
            } while (choix!="6");
        
                
        }


}