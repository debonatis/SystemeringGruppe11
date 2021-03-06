package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * OrdreId generated by hbm2java
 */
public class OrdreId  implements java.io.Serializable {


     private String brukernavn;
     private String salgsnummer;

    public OrdreId() {
    }

    public OrdreId(String brukernavn, String salgsnummer) {
       this.brukernavn = brukernavn;
       this.salgsnummer = salgsnummer;
    }
   
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public String getSalgsnummer() {
        return this.salgsnummer;
    }
    
    public void setSalgsnummer(String salgsnummer) {
        this.salgsnummer = salgsnummer;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrdreId) ) return false;
		 OrdreId castOther = ( OrdreId ) other; 
         
		 return ( (this.getBrukernavn()==castOther.getBrukernavn()) || ( this.getBrukernavn()!=null && castOther.getBrukernavn()!=null && this.getBrukernavn().equals(castOther.getBrukernavn()) ) )
 && ( (this.getSalgsnummer()==castOther.getSalgsnummer()) || ( this.getSalgsnummer()!=null && castOther.getSalgsnummer()!=null && this.getSalgsnummer().equals(castOther.getSalgsnummer()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBrukernavn() == null ? 0 : this.getBrukernavn().hashCode() );
         result = 37 * result + ( getSalgsnummer() == null ? 0 : this.getSalgsnummer().hashCode() );
         return result;
   }   


}


