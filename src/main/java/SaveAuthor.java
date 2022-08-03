import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import crud.Author;

public class SaveAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Author a = new Author();
		a.setAuthorid(1111L);
		a.setAuthorName("James Greesham");
		a.setCity("CHE");
		a.setCountry("IND");
	}

}
