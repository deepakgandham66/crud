import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseConnFactorySingleton {
	public static SessionFactory sessionFactory = null;
	private DatabaseConnFactorySingleton() {	
	}
	public static synchronized SessionFactory getSessionFactoryConnection() {
		if (sessionFactory==null)
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}
}
