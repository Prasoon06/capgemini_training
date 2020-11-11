package com.cg.jpa_firstdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa_firstdemo.model.UserDetail;

public class App 
{
    public static void main( String[] args )
    {
    	
    	// DAO Layer -- will receive one model from service layer
    	UserDetail user =  new UserDetail();
    	user.setId(101);
    	user.setName("Pankaj Sharma");
        //1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager();
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	em.persist(user);
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
    }
}
