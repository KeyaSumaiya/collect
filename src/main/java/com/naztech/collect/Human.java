package com.naztech.collect;

import java.time.LocalDate;

public class Human implements Comparable<Human> {
	String name;
	int age;
	float income;
	LocalDate dateofBirth;

	public Human() {
		
	}

	public Human(String name, int age, double income, LocalDate dateofBirth) {
		super();
		this.name = name;
		this.age = age;
		this.income = (float) income;
		this.dateofBirth = dateofBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}



	/*@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", income=" + income + ", dateofBirth=" + dateofBirth + "]";
	}*/
	
	

 
	public int compareTo(Human human) 
	{ 
	    return this.age - human.age; 
	} 

	@Override
	public boolean equals(Object obj) {
		Human hum = (Human) obj;
		return this.getName().equals(hum.getName()) && this.getAge() == (hum.getAge())&&
				Float.valueOf(this.getIncome()).equals(Float.valueOf(hum.getIncome()))
				&& this.dateofBirth.equals(hum.getDateofBirth());
	}


}
