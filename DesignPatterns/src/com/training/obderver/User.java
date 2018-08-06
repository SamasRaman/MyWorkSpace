package com.training.obderver;


public class User implements IObserver{
	
	private IObservable observable;
	private String name;
	
	//the constructor is a mapper between
	//the enduser and the notification(product)
	public void buyMobile() {
		System.out.println("Hurry ,I ve brought OnePlus6T, by "+name);
	}

	@Override
	public void update() {
		//return the observer from OnePlus6T
		buyMobile();
		
	}
	
	public void unSubscribe() {
		observable.remove(this);
	}

	public User(IObservable observable, String name) {
		super();
		this.observable = observable;
		this.name = name;
	}

}
