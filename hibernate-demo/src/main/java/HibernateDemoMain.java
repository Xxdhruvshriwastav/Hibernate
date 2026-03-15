import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateDemoMain {

	public static void main(String[] args) {
		
		Session session = HibernateUtil
                .getSessionFactory()
                .openSession();
		
		
		try {
			
			UserClassHibernate user = new UserClassHibernate(1L, "Ashish");
			
			session.beginTransaction();
			session.persist(user); // save(user)
			session.getTransaction().commit();
			System.out.println("User Saved: " + user.getId());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			HibernateUtil.close();
		}
	}
}
