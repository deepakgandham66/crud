import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import crud.Book;

public class SaveBook {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();

		Book b = new Book();
		b.setSubject("Mobile Application");
		b.setTitle("Python");

		
		session.save(b);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
