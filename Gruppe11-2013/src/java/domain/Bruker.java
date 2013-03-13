package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * Bruker generated by hbm2java
 */
public class Bruker  implements java.io.Serializable {


     private String brukernavn;
     private String passord;
     private String fornavn;
     private String etternavn;
     private String adresse;
     private String email;
     private int telefon;
     private Integer postnummer;

    public Bruker() {
    }

	
    public Bruker(String brukernavn, String passord, String fornavn, String etternavn, String adresse, String email, int telefon) {
        this.brukernavn = brukernavn;
        this.passord = passord;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.email = email;
        this.telefon = telefon;
    }
    public Bruker(String brukernavn, String passord, String fornavn, String etternavn, String adresse, String email, int telefon, Integer postnummer) {
       this.brukernavn = brukernavn;
       this.passord = passord;
       this.fornavn = fornavn;
       this.etternavn = etternavn;
       this.adresse = adresse;
       this.email = email;
       this.telefon = telefon;
       this.postnummer = postnummer;
    }
   
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public String getPassord() {
        return this.passord;
    }
    
    public void setPassord(String passord) {
        this.passord = passord;
    }
    public String getFornavn() {
        return this.fornavn;
    }
    
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getEtternavn() {
        return this.etternavn;
    }
    
    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    public Integer getPostnummer() {
        return this.postnummer;
    }
    
    public void setPostnummer(Integer postnummer) {
        this.postnummer = postnummer;
    }




}

