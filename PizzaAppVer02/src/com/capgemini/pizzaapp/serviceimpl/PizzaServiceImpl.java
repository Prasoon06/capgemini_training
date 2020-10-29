package com.capgemini.pizzaapp.serviceimpl;

import java.util.List;

import com.capgemini.pizzaapp.dao.PizzaDAO;
import com.capgemini.pizzaapp.daoimpl.PizzaDAOImpl;
import com.capgemini.pizzaapp.model.Pizza;
import com.capgemini.pizzaapp.service.PizzaService;

public class PizzaServiceImpl implements PizzaService{
	
	private PizzaDAO pizzaDAO;
	
	public PizzaServiceImpl() {
		pizzaDAO=new PizzaDAOImpl(); // DI _ Loose coupling here
	}

	@Override
	public void orderPizza(Pizza pizza) {
		//TODO logic for pizza order
		pizza.setId(System.currentTimeMillis());
		pizzaDAO.insert(pizza);
		
	}

	@Override
	public List<Pizza> getAllPizzas() {
		// TODO Biz logic go here
		return pizzaDAO.list();
	}

}
