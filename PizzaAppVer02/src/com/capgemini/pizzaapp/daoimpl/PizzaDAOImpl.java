package com.capgemini.pizzaapp.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.pizzaapp.dao.PizzaDAO;
import com.capgemini.pizzaapp.model.Pizza;

public class PizzaDAOImpl implements PizzaDAO{
	
	private List<Pizza> pizzaRepository;
	
	public PizzaDAOImpl() {
		pizzaRepository = new ArrayList<>(); // Dependency
	}

	@Override
	public void insert(Pizza pizza) {
		pizzaRepository.add(pizza);
		
	}

	@Override
	public List<Pizza> list() {
		return pizzaRepository;
	}

	@Override
	public void update(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
