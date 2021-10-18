import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.mobilephone.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("thuy@code.java.net");
		user1.setFullName("Mai Ho An Thuy");
		user1.setPassword("helloworld");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MobilePhoneWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();		

		entityManager.getTransaction().begin();
		
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A Users object was persisted");
	}

}
