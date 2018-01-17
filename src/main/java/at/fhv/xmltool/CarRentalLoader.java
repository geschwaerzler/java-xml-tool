package at.fhv.xmltool;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import at.fhv.xmltool.carrental.jaxb.Stadt;
import at.fhv.xmltool.carrental.jaxb.VermietStation;
import at.fhv.xmltool.carrental.jpa.JPAStadt;
import at.fhv.xmltool.carrental.jpa.JPAVermietstation;
import at.fhv.xmltool.carrental.jpa.JPAVermietstationId;

public class CarRentalLoader {
    private static final String PERSISTENCE_UNIT_NAME = "xmltool-carrental";
	private static EntityManagerFactory factory;

    public static void load(at.fhv.xmltool.carrental.jaxb.CarRental carRental) {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		int stadtCount = 0;
		int vermietStationCount = 0;
		for (Stadt stadtElem: carRental.getStadt()) {
			JPAStadt stadtEntity = new JPAStadt(stadtElem.getStadtcode());
			stadtEntity.setName(stadtElem.getName());
			stadtEntity.setEinwohnerAnzahl(Integer.valueOf(stadtElem.getEinwohnerAnzahl()));
			em.persist(stadtEntity);
			stadtCount++;

			for (VermietStation stationElem: stadtElem.getVermietStation()) {
				JPAVermietstation stationEntity = new JPAVermietstation(
					new JPAVermietstationId(stadtElem.getStadtcode(), stationElem.getStationsName()),
					stadtEntity);
				stationEntity.setJPAStadt(stadtEntity);
				stationEntity.setAdresse(stationElem.getAdresse());
				stationEntity.setMitarbeiterAnzahl(Integer.valueOf(stationElem.getMitarbeiterAnzahl()));
				em.persist(stationEntity);
				vermietStationCount++;
			}
		}

		em.getTransaction().commit();		
		em.close();
		factory.close();
		System.out.println(stadtCount + " cities, " + vermietStationCount + " locations successfully imported");
    }
}