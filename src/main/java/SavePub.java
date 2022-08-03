import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import crud.Publication;

public class SavePub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();

		Publication p = new Publication();
		p.setPublicationId(12345L);
		p.setPublicationName("Oreilly");
		p.setCity("California");
		p.setCountry("USA");
		
		
		session.save(p);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
