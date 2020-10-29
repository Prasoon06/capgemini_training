package com.capgemini.pizzaapp.util;

import java.util.List;
import java.util.Scanner;

import com.capgemini.pizzaapp.model.Pizza;
import com.capgemini.pizzaapp.service.PizzaService;
import com.capgemini.pizzaapp.serviceimpl.PizzaServiceImpl;

public class MenuUtil {
	
	private PizzaService pizzaService;
	
	public MenuUtil() {
		pizzaService =  new PizzaServiceImpl();
	}
	
	private void showMenu() {
		
		System.out.println("----------Pizza Menu--------------");
		System.out.println("1. Order Pizza");
		System.out.println("2. List all Pizza");
		System.out.println("Enter your choice");

	}
	
	public void startApp() {
		Scanner sc=new Scanner(System.in);
		String continueStr;
		
		do {
			menuOperations(sc);
			System.out.println("Do you want to continue : [Y | N]");
			continueStr=sc.next();
		}while(continueStr.equalsIgnoreCase("y"));
	}

	private void menuOperations(Scanner sc) {
		
		showMenu();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Pizza Name : ");
			String name = sc.next();
			System.out.println("Enter Pizza Size : ");
			String size = sc.next();
			System.out.println("Enter Pizza Crust : ");
			String crust = sc.next();
			pizzaService.orderPizza(new Pizza(name, crust, size));
			
			break;
		case 2:
			List<Pizza> pizzaList =  pizzaService.getAllPizzas();
			System.out.println("----------------Pizza Detail----------------------");
			for (Pizza pizza : pizzaList) {
				System.out.println(pizza);
			}
			break;

		default:
			System.out.println(" Wrong Choice");
			break;
		}
	}

}
