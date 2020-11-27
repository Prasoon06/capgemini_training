package com.cg.springxmlannodemo.domain;
/**
 * Project domain is user managed object. Spring will not be handling this object.
 * As and when this will be required, this we will be creating as per our need. 
 * @author panka
 *
 */
public class Project {
	
	private int id;
	private String name;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}
