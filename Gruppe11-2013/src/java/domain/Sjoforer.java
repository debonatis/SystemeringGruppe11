package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * Sjoforer generated by hbm2java
 */
public class Sjoforer  implements java.io.Serializable {


     private String brukernavn;
     private String forekortklasse;

    public Sjoforer() {
    }

    public Sjoforer(String brukernavn, String forekortklasse) {
       this.brukernavn = brukernavn;
       this.forekortklasse = forekortklasse;
    }
   
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public String getForekortklasse() {
        return this.forekortklasse;
    }
    
    public void setForekortklasse(String forekortklasse) {
        this.forekortklasse = forekortklasse;
    }




}


