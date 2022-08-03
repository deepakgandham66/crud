
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import crud.EmployeeData;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SessionFactory sessionFactory = new Configuration().configure("config.xml").buildSessionFactory();
//		Session session = sessionFactory.openSession();

		Session session = DatabaseConnFactorySingleton.getSessionFactoryConnection().openSession();
		Transaction transaction= session.beginTransaction();
		
		EmployeeData d = new EmployeeData();
//		d.setEmpid(1);
//		d.setName("Deepak");
//		d.setPhone("9100988197");
//		d.setCity("Hyd");
//		
//		d.setEmpid(2);
//		d.setName("Advait");
//		d.setPhone("9100988198");
//		d.setCity("MUM");
		
		d.setEmpid(3);
		d.setName("ayaan");
		d.setPhone("9100988199");
		d.setCity("DEL");
		
		session.save(d);
		transaction.commit();
	}

}
