package at.fhv.xmltool.carrental.jpa;
// Generated 17.01.2018 18:27:00 by Hibernate Tools 4.3.2-SNAPSHOT


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JPAVermietstationId generated by hbm2java
 */
@Embeddable
public class JPAVermietstationId  implements java.io.Serializable {


     private String stadtcode;
     private String stationsName;

    public JPAVermietstationId() {
    }

    public JPAVermietstationId(String stadtcode, String stationsName) {
       this.stadtcode = stadtcode;
       this.stationsName = stationsName;
    }
   


    @Column(name="stadtcode", nullable=false, length=3)
    public String getStadtcode() {
        return this.stadtcode;
    }
    
    public void setStadtcode(String stadtcode) {
        this.stadtcode = stadtcode;
    }


    @Column(name="stations_name", nullable=false, length=20)
    public String getStationsName() {
        return this.stationsName;
    }
    
    public void setStationsName(String stationsName) {
        this.stationsName = stationsName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof JPAVermietstationId) ) return false;
		 JPAVermietstationId castOther = ( JPAVermietstationId ) other; 
         
		 return ( (this.getStadtcode()==castOther.getStadtcode()) || ( this.getStadtcode()!=null && castOther.getStadtcode()!=null && this.getStadtcode().equals(castOther.getStadtcode()) ) )
 && ( (this.getStationsName()==castOther.getStationsName()) || ( this.getStationsName()!=null && castOther.getStationsName()!=null && this.getStationsName().equals(castOther.getStationsName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getStadtcode() == null ? 0 : this.getStadtcode().hashCode() );
         result = 37 * result + ( getStationsName() == null ? 0 : this.getStationsName().hashCode() );
         return result;
   }   


}


