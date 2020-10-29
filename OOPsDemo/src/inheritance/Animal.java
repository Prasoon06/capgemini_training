package inheritance;

public class Animal {
	private String name;
	
	
	public Animal() {
		//this.name="Unknown";---not correct
		this("Unknown"); // Constructor Chaining
	}
	/*
	 * Property initialization techique
	 * 1. Direct initializtion at the time of property creation
	 * 2. Initialization using constructor
	 */
	//Job of parameterized construtor :  it is to assign provided value to class variable/ instance variable. 
	public Animal(String name) {
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println(getName()+" is eating");
	}
	
	public void run() {
		System.out.println(getName()+" is running");
	}
}
