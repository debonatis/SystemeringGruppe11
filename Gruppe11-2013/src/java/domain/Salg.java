package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * Salg generated by hbm2java
 */
public class Salg  implements java.io.Serializable {


     private String salgsnummer;
     private String sumsalg;

    public Salg() {
    }

	
    public Salg(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }
    public Salg(String salgsnummer, String sumsalg) {
       this.salgsnummer = salgsnummer;
       this.sumsalg = sumsalg;
    }
   
    public String getSalgsnummer() {
        return this.salgsnummer;
    }
    
    public void setSalgsnummer(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }
    public String getSumsalg() {
        return this.sumsalg;
    }
    
    public void setSumsalg(String sumsalg) {
        this.sumsalg = sumsalg;
    }




}


