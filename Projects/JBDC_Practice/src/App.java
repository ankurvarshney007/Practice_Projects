import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory s = con.buildSessionFactory();
		Session sess = s.openSession();
		Alien a1 = new Alien();
		a1.setAid(1);
		a1.setAname("Shrishti");
		s.close();
		
		
		

	}

}
