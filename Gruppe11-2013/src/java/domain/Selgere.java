package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * Selgere generated by hbm2java
 */
public class Selgere  implements java.io.Serializable {


     private String brukernavn;
     private String salgpermaned;
     private String opparbeidetprovisjon;
     private String antsalg;
     private String timer;

    public Selgere() {
    }

	
    public Selgere(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public Selgere(String brukernavn, String salgpermaned, String opparbeidetprovisjon, String antsalg, String timer) {
       this.brukernavn = brukernavn;
       this.salgpermaned = salgpermaned;
       this.opparbeidetprovisjon = opparbeidetprovisjon;
       this.antsalg = antsalg;
       this.timer = timer;
    }
   
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public String getSalgpermaned() {
        return this.salgpermaned;
    }
    
    public void setSalgpermaned(String salgpermaned) {
        this.salgpermaned = salgpermaned;
    }
    public String getOpparbeidetprovisjon() {
        return this.opparbeidetprovisjon;
    }
    
    public void setOpparbeidetprovisjon(String opparbeidetprovisjon) {
        this.opparbeidetprovisjon = opparbeidetprovisjon;
    }
    public String getAntsalg() {
        return this.antsalg;
    }
    
    public void setAntsalg(String antsalg) {
        this.antsalg = antsalg;
    }
    public String getTimer() {
        return this.timer;
    }
    
    public void setTimer(String timer) {
        this.timer = timer;
    }




}


