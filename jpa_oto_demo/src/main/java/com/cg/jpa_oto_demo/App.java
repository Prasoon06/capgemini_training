package com.cg.jpa_oto_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa_oto_demo.model.Employee;
import com.cg.jpa_oto_demo.model.Project;




public class App 
{
    public static void main( String[] args )
    {
    	// DAO Layer -- will receive one model from service layer
    	Employee emp1=new Employee();
    	emp1.setName("Pankaj Sharma");
    	
    	Project project = new Project();
    	project.setTitle("J2EE Full Stack");
    	
    	emp1.setProject(project);
        //1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager();
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	em.persist(emp1);
    	em.persist(project);
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
    }
}
