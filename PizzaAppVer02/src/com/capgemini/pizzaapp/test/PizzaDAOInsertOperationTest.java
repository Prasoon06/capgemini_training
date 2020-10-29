package com.capgemini.pizzaapp.test;

import java.util.List;

import com.capgemini.pizzaapp.dao.PizzaDAO;
import com.capgemini.pizzaapp.daoimpl.PizzaDAOImpl;
import com.capgemini.pizzaapp.model.Pizza;

public class PizzaDAOInsertOperationTest {

	public static void main(String[] args) {
		PizzaDAO pizzaDAO = new PizzaDAOImpl();
		Pizza pizza=new Pizza("Pizza1", "Thin", "Medium");
		pizza.setId(System.currentTimeMillis());
		pizzaDAO.insert(pizza);
		List<Pizza> pizzaList =pizzaDAO.list();
		System.out.println(pizzaList);
	}

}
