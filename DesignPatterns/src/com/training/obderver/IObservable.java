package com.training.obderver;


public interface IObservable {
	
	public void addUser(IObserver observers);
	public void remove(IObserver observers);
	
	//all those people who are in list
	public void notifyObserver();

}
