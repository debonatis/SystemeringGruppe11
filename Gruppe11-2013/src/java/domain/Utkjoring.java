package domain;
// Generated 13.mar.2013 17:31:33 by Hibernate Tools 3.2.1.GA



/**
 * Utkjoring generated by hbm2java
 */
public class Utkjoring  implements java.io.Serializable {


     private UtkjoringId id;
     private String utkorinkogstatus;

    public Utkjoring() {
    }

	
    public Utkjoring(UtkjoringId id) {
        this.id = id;
    }
    public Utkjoring(UtkjoringId id, String utkorinkogstatus) {
       this.id = id;
       this.utkorinkogstatus = utkorinkogstatus;
    }
   
    public UtkjoringId getId() {
        return this.id;
    }
    
    public void setId(UtkjoringId id) {
        this.id = id;
    }
    public String getUtkorinkogstatus() {
        return this.utkorinkogstatus;
    }
    
    public void setUtkorinkogstatus(String utkorinkogstatus) {
        this.utkorinkogstatus = utkorinkogstatus;
    }




}

