package com.edu.ognl.action;

import java.util.Date;

public class Person {
	private String name;
	private int age;
	private Date birthday;
	
	
	public Person() {}
	
	public Person(String name, int age, Date birthday) {		
		this.name = name;
		this.age = age;
		this.birthday = birthday;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}	

}
