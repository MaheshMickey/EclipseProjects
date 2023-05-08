package com.sprongboot.DogDemo;

/**
 * @author Mahesh Kumar Nanganoori
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Used to denote a class as component which automatically detect for dependency injection
@Component
//to call the objects multiple times
@Scope (value = "prototype")
public class Dog {

	private int id;
	private String name;
	private String breed;
	
	//Dependency 
	@Autowired
	private Trainer trainer;
	
	public Dog() {
	    id = -99;
	    name = "No yet decided";
	    breed = "Hybrid";
	    System.out.println("Object Created");
	}
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + "]"+"\n"+
				trainer.toString();
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	
}
