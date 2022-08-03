import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import crud.Phone;

public class SavePhone {
	public static void main(String args[]) {
		
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction= session.beginTransaction();
	
	Phone p = new Phone();
	p.setContactid(221810311007L);
	p.setPh_num(9949847321L);
	p.setType("Mobile");
	}
	
}
