package com.capgemini.pizzaapp.model;

/**
 * This Pizza Component is used as a data travler object from layer to layer
 * 
 * @author pankaj
 *
 */
public class Pizza {

	/**
	 * id of the pizza, that is ordered
	 */
	private Long id;
	/**
	 * Name of the pizza
	 */
	private String name;
	/**
	 * Crust of the pizza
	 */
	private String crust;
	/**
	 * Toppings on pizza, it can be changed as per customer preference
	 */
	private String toppings;
	/**
	 * Size of the pizza, it should be only Medium, Large, Normal
	 */
	private String size;

	public Pizza(String name, String crust, String size) {
		super();
		this.name = name;
		this.crust = crust;
		this.size = size;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", crust=" + crust + ", size=" + size + "]";
	}
	
	

}
