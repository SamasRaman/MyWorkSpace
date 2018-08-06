package com.training.obderver;

public class Client {
public static void main(String[] args) {
	 IObservable observable= new OnePlus6T();
	 
	 
	 
	 IObserver user1=new User(observable,"Kumar");
	 IObserver user2=new User(observable,"Anuj");
	 IObserver user3=new User(observable,"deep");
	 
	 IObservable observable1= new OnePlus7T();
	 IObserver user5=new User(observable1,"Kanta");
	 IObserver user6=new User(observable1,"Rashmi");
	 
	 observable.addUser(user1);
	 observable.addUser(user2);
	 observable.addUser(user3);
	 observable1.addUser(user5);
	 observable1.addUser(user6);
	 
	 ((OnePlus6T)observable).setArrived(true);
	 ((OnePlus7T)observable1).setArrived(true);
}
}
