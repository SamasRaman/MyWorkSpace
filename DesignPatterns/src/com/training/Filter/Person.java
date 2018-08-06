package com.training.Filter;

public class Person {
 private String name;
 private String sex;
 private String martialStatus;
 
 
 
@Override
public String toString() {
	return "Person [name=" + name + ", sex=" + sex + ", martialStatus=" + martialStatus + "]";
}
public Person(String name, String sex, String martialStatus) {
	super();
	this.name = name;
	this.sex = sex;
	this.martialStatus = martialStatus;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getMartialStatus() {
	return martialStatus;
}
public void setMartialStatus(String martialStatus) {
	this.martialStatus = martialStatus;
}

 
 
 
 
}
