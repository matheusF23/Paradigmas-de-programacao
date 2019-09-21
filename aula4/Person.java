package com.paradigmas.lab.aula4;

public class Person {
	//private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	static private int countPerson = 0;
	
	public Person(String firstName, String lastName, int age) {   // Construtor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		countPerson++;
	}
	
	/*
	public void setName(String name) {
		this.name = name;
	}*/
	
	public String getName() {
		return firstName.concat(" ").concat(lastName);
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return countPerson + ":" + firstName + " " + lastName + ", " + age;
	}
}
