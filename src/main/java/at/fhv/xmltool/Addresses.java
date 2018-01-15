package at.fhv.xmltool;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import at.fhv.xmltool.addressbook.jaxb.JAXBAddressType;
import at.fhv.xmltool.addressbook.jaxb.JAXBAddressbookType;
import at.fhv.xmltool.addressbook.jaxb.JAXBPersonType;
import at.fhv.xmltool.addressbook.jpa.JPAAddress;
import at.fhv.xmltool.addressbook.jpa.JPAPerson;

public class Addresses {
    private static final String PERSISTENCE_UNIT_NAME = "xmllab-addresses";
	private static EntityManagerFactory factory;

	public static void addSomeAddress(JAXBAddressbookType addressbook) {
		JAXBPersonType donald = new JAXBPersonType();
		donald.setFirstname("Donald");
		donald.setLastname("Trump");

		JAXBAddressType trumpTower = new JAXBAddressType();
		trumpTower.setStreet("725 5th Avenue");
		trumpTower.setZip("NY 10022");
		trumpTower.setCity("New York");
		trumpTower.setCountry("USA");

		donald.getAddress().add(trumpTower);

		addressbook.getPerson().add(donald);
	}

    public static void load(JAXBAddressbookType addressbook) {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		int personCount = 0;
		int addrCount = 0;
		for (JAXBPersonType pElem: addressbook.getPerson()) {
			JPAPerson pEntity = new JPAPerson(pElem.getFirstname(), pElem.getLastname());
			em.persist(pEntity);
			personCount++;

			for (JAXBAddressType aElem: pElem.getAddress()) {
				JPAAddress aEntity = new JPAAddress(
					pEntity,
					aElem.getStreet(),
					aElem.getZip(),
					aElem.getCity(),
					aElem.getCountry());
				em.persist(aEntity);
				addrCount++;
			}
		}

		em.getTransaction().commit();		
		em.close();
		factory.close();
		System.out.println(personCount + " persons, " + addrCount + " addresses successfully imported");
    }
}