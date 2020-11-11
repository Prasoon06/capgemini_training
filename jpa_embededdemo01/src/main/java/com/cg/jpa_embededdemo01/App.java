package com.cg.jpa_embededdemo01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa_embededdemo01.model.Address;
import com.cg.jpa_embededdemo01.model.UserDetail;


public class App 
{
    public static void main( String[] args )
    {
// DAO Layer -- will receive one model from service layer
    	
    	
        //1. Create Entity Manger Factory - Factory Design Pattern - load driver
    	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPA-PU");
    	//2. Create Entity Manager- get connection
    	EntityManager em =  emf.createEntityManager();
    	//3. begin transaction - statement/ create query
    	em.getTransaction().begin();
    	//4. Perform transaction- execute query
    	UserDetail user =  new UserDetail();
    	user.setName("Pankaj Sharma");
    	user.setContact("8827611875");
    	
    	Address address = new Address();
    	address.setHouseno("168B");
    	address.setCity("Indore");
    	address.setState("MP");
    	address.setZip("452020");
    	
    	user.setAddress(address);
    	em.persist(user);
    	//5. Commit changes- automatic
    	em.getTransaction().commit();
    	//6. Release Resources - stmt and con close
    	em.close();
    	emf.close();
    }
}
