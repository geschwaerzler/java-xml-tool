package at.fhv.xmltool;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import at.fhv.xmltool.messages2.jaxb.JAXBMessageListType;

public class Messages2 {
    private static final String PERSISTENCE_UNIT_NAME = "xmllab-messages2";
	private static EntityManagerFactory factory;

    public static void load(JAXBMessageListType messagelist) {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

        //here comes your work

		em.getTransaction().commit();		
		em.close();
		factory.close();
    }
}