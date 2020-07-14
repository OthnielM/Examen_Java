import java.time.LocalDate;

public class Journalier extends Employe {

        //proprietes
        private Double forfait;
        private int duree;
    
        public Journalier(){
            super();
        }
    
        public Journalier(String nomComplet, int forfait, int duree){
            super(nomComplet);
            this.forfait = forfait;
            this.duree = duree;
        }
    
        public Double getForfait(){
            return this.forfait;
        }
        public void setForfait(Double forfait){
            this.forfait = forfait;
        }
    
        public int getDuree(){
            return this.duree;
        }
        public void setDuree(int duree){
            this.duree = duree;
        }
    
        @Override
        public String affiche(){
           return super.affiche() +" Forfait : "+this.forfait+" Duree "+this.duree;
        }
}