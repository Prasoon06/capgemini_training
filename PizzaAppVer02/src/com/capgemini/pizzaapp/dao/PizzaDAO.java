package com.capgemini.pizzaapp.dao;

import java.util.List;

import com.capgemini.pizzaapp.model.Pizza;

/**
 * This PizzaDAO will perform all the CRUD operation on Pizza Note : In this
 * application we are not using DB, so data will be avialable in LocalRepository
 * 
 * @author pankaj
 *
 */
public interface PizzaDAO {

	/**
	 * This insert method will save the pizza in Repository
	 * 
	 * @param pizza parameter, pizza ordered by customer
	 */
	void insert(Pizza pizza);

	/**
	 * This list method will return the available pizzas from repository
	 * 
	 * @return pizzas if found otherwise null
	 */
	List<Pizza> list();

	/**
	 * This update method will update the pizza information that is provided in
	 * pizza object
	 * 
	 * @param pizza to be updated
	 */
	void update(Pizza pizza);

	/**
	 * Delete the pizza by id
	 * 
	 * @param id of the pizza to be deleted,if not found, show id related error
	 */
	void delete(int id);

	/**
	 * Delete the pizza as per the provided information
	 * 
	 * @param pizza to be deleted
	 */
	void delete(Pizza pizza);
}
