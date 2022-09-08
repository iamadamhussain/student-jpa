package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class CreateStudent {
public static void main(String[] args) {
	
	
EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("student_xworkz");
EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction transaction=entityManager.getTransaction();
transaction.begin();

Student student=new Student();
student.setAge("35");
student.setName("RRR");
student.setId(122);


entityManager.persist(student);
transaction.commit();
entityManager.close();
entityManagerFactory.close();

}
}
