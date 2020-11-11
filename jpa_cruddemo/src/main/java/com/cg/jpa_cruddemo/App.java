package com.cg.jpa_cruddemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.jpa_cruddemo.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	//--- fetch()
    	//save(); 
    	//-----find()
        //findOperation();
    	//-----find() --- Setters
    	//update();
    	//-----find() --- remove()
    	//remove();
    	
    	findAll();
    }

	private static void findAll() {
		//1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager(); // session
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	Query query = em.createQuery("from Employee");
    	List<Employee> employees =  query.getResultList();
    	for (Employee employee : employees) {
			System.out.println(employee.getId() + "---------"+employee.getName());
		}
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
	}

	private static void remove() {
		//1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager(); // session
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	Employee emp = em.find(Employee.class, 7);
    	em.remove(emp);
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
	}

	private static void update() {
		//1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager(); // session
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	Employee emp = em.find(Employee.class, 7);
    	emp.setName("Priyansh Sharma-Updated");
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
	}

	private static void findOperation() {
		//1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager();
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	Employee emp = em.find(Employee.class, 7);
    	System.out.println(emp.getName());
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
	}

	private static void save() {
		// DAO Layer -- will receive one model from service layer
    	Employee emp1=new Employee();
    	emp1.setName("Manvi Sharma");
        //1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager();
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	em.persist(emp1);
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
	}
}
