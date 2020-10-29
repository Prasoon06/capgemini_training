package com.capgemini.pizzaapp.service;

import java.util.List;

import com.capgemini.pizzaapp.model.Pizza;

/**
 * This PizzaService will perform all the business logic.
 * like : orderPizza, cookPizza, displayPizzaDetail, getAllPizza, customizePizza
 * @author pankaj
 *
 */
public interface PizzaService {
	/**
	 * This orderPizza will take the order from the customer and pass on to DAO layer.
	 * @param pizza
	 */
	void orderPizza(Pizza pizza);
	
	/**
	 * get the list of all pizzas available in system, if not available return null
	 * @return the pizzas available, if not null
	 */
	List<Pizza> getAllPizzas();

}
