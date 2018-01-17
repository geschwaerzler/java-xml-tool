package at.fhv.xmltool.carrental.jpa;
// Generated 17.01.2018 18:27:00 by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JPAAuto generated by hbm2java
 */
@Entity
@Table(name="auto"
    ,schema="public"
)
public class JPAAuto  implements java.io.Serializable {


     private String kennzeichen;
     private JPAAutotyp JPAAutotyp;
     private JPAVermietstation JPAVermietstation;
     private Integer kmStand;
     private String farbe;
     private Set<JPAExtraausstattung> JPAExtraausstattungs = new HashSet<JPAExtraausstattung>(0);

    public JPAAuto() {
    }

	
    public JPAAuto(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
    public JPAAuto(String kennzeichen, JPAAutotyp JPAAutotyp, JPAVermietstation JPAVermietstation, Integer kmStand, String farbe, Set<JPAExtraausstattung> JPAExtraausstattungs) {
       this.kennzeichen = kennzeichen;
       this.JPAAutotyp = JPAAutotyp;
       this.JPAVermietstation = JPAVermietstation;
       this.kmStand = kmStand;
       this.farbe = farbe;
       this.JPAExtraausstattungs = JPAExtraausstattungs;
    }
   
     @Id 

    
    @Column(name="kennzeichen", unique=true, nullable=false, length=8)
    public String getKennzeichen() {
        return this.kennzeichen;
    }
    
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="typ_bezeichnung")
    public JPAAutotyp getJPAAutotyp() {
        return this.JPAAutotyp;
    }
    
    public void setJPAAutotyp(JPAAutotyp JPAAutotyp) {
        this.JPAAutotyp = JPAAutotyp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="stadtcode", referencedColumnName="stadtcode"), 
        @JoinColumn(name="stations_name", referencedColumnName="stations_name") } )
    public JPAVermietstation getJPAVermietstation() {
        return this.JPAVermietstation;
    }
    
    public void setJPAVermietstation(JPAVermietstation JPAVermietstation) {
        this.JPAVermietstation = JPAVermietstation;
    }

    
    @Column(name="km_stand", precision=6, scale=0)
    public Integer getKmStand() {
        return this.kmStand;
    }
    
    public void setKmStand(Integer kmStand) {
        this.kmStand = kmStand;
    }

    
    @Column(name="farbe", length=8)
    public String getFarbe() {
        return this.farbe;
    }
    
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="JPAAutos")
    public Set<JPAExtraausstattung> getJPAExtraausstattungs() {
        return this.JPAExtraausstattungs;
    }
    
    public void setJPAExtraausstattungs(Set<JPAExtraausstattung> JPAExtraausstattungs) {
        this.JPAExtraausstattungs = JPAExtraausstattungs;
    }




}


