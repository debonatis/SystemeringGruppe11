/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author deb
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "retter")
public class Rett implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long rettnummer;
    @Basic
    private String navn;
    @Basic
    private String beskrivelse;
    @Basic
    private Integer ingredienser;
    @Basic
    private Double kalorier;
    @Basic
    private Double pris;
    @Basic
    private Double vekt;

    public Rett() {
    }

    public long getRettnummer() {
        return rettnummer;
    }

    public void setRettnummer(long rettnummer) {
        this.rettnummer = rettnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Integer getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(Integer ingredienser) {
        this.ingredienser = ingredienser;
    }

    public Double getKalorier() {
        return kalorier;
    }

    public void setKalorier(Double kalorier) {
        this.kalorier = kalorier;
    }

    public Double getPris() {
        return pris;
    }

    public void setPris(Double pris) {
        this.pris = pris;
    }

    public Double getVekt() {
        return vekt;
    }

    public void setVekt(Double vekt) {
        this.vekt = vekt;
    }
}
