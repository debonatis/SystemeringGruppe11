package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * RolleId generated by hbm2java
 */
public class RolleId  implements java.io.Serializable {


     private String brukernavn;
     private String rollen;

    public RolleId() {
    }

    public RolleId(String brukernavn, String rollen) {
       this.brukernavn = brukernavn;
       this.rollen = rollen;
    }
   
    public String getBrukernavn() {
        return this.brukernavn;
    }
    
    public void setBrukernavn(String brukernavn) {
        this.brukernavn = brukernavn;
    }
    public String getRollen() {
        return this.rollen;
    }
    
    public void setRollen(String rollen) {
        this.rollen = rollen;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RolleId) ) return false;
		 RolleId castOther = ( RolleId ) other; 
         
		 return ( (this.getBrukernavn()==castOther.getBrukernavn()) || ( this.getBrukernavn()!=null && castOther.getBrukernavn()!=null && this.getBrukernavn().equals(castOther.getBrukernavn()) ) )
 && ( (this.getRollen()==castOther.getRollen()) || ( this.getRollen()!=null && castOther.getRollen()!=null && this.getRollen().equals(castOther.getRollen()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBrukernavn() == null ? 0 : this.getBrukernavn().hashCode() );
         result = 37 * result + ( getRollen() == null ? 0 : this.getRollen().hashCode() );
         return result;
   }   


}


