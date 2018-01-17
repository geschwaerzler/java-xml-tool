package at.fhv.xmltool.carrental.jpa;
// Generated 17.01.2018 18:27:00 by Hibernate Tools 4.3.2-SNAPSHOT


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * JPAStadt generated by hbm2java
 */
@Entity
@Table(name="stadt"
    ,schema="public"
)
public class JPAStadt  implements java.io.Serializable {


     private String stadtcode;
     private String name;
     private Integer einwohnerAnzahl;
     private Set<JPAVermietstation> JPAVermietstations = new HashSet<JPAVermietstation>(0);

    public JPAStadt() {
    }

	
    public JPAStadt(String stadtcode) {
        this.stadtcode = stadtcode;
    }
    public JPAStadt(String stadtcode, String name, Integer einwohnerAnzahl, Set<JPAVermietstation> JPAVermietstations) {
       this.stadtcode = stadtcode;
       this.name = name;
       this.einwohnerAnzahl = einwohnerAnzahl;
       this.JPAVermietstations = JPAVermietstations;
    }
   
     @Id 

    
    @Column(name="stadtcode", unique=true, nullable=false, length=3)
    public String getStadtcode() {
        return this.stadtcode;
    }
    
    public void setStadtcode(String stadtcode) {
        this.stadtcode = stadtcode;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="einwohner_anzahl")
    public Integer getEinwohnerAnzahl() {
        return this.einwohnerAnzahl;
    }
    
    public void setEinwohnerAnzahl(Integer einwohnerAnzahl) {
        this.einwohnerAnzahl = einwohnerAnzahl;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="JPAStadt")
    public Set<JPAVermietstation> getJPAVermietstations() {
        return this.JPAVermietstations;
    }
    
    public void setJPAVermietstations(Set<JPAVermietstation> JPAVermietstations) {
        this.JPAVermietstations = JPAVermietstations;
    }




}


