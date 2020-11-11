package com.cg.jpa_collectiondfgdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa_collectiondfgdemo.model.Address;
import com.cg.jpa_collectiondfgdemo.model.UserDetail;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	UserDetail user =  new UserDetail();
    	user.setName("Pankaj Sharma");
    	user.setContact("8827611875");
    	
    	Address homeAddress = new Address();
    	homeAddress.setHouseno("168B");
    	homeAddress.setCity("Indore");
    	homeAddress.setState("MP");
    	homeAddress.setZip("452020");
    	
    	Address permanentAddress = new Address();
    	permanentAddress.setHouseno("F65");
    	permanentAddress.setCity("Bhopal");
    	permanentAddress.setState("MP");
    	permanentAddress.setZip("452001");
    	
    	user.getAddresses().add(homeAddress);
    	user.getAddresses().add(permanentAddress);
    	
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
