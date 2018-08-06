package com.training.obderver;

import java.util.ArrayList;
import java.util.List;

public class OnePlus7T implements IObservable{
	
	private List<IObserver> users;
	private boolean isArrived=true;
	
	public  OnePlus7T() {
		users=new ArrayList<IObserver>();
	}

	@Override
	public void addUser(IObserver observers) {
		users.add(observers);
		
	}

	@Override
	public void remove(IObserver observers) {
		users.add(observers);
		
	}

	
	
	@Override
	public void notifyObserver() {
		for(IObserver temp : users) {
			temp.update();
		}
		
	}
	
	public boolean isArrived() {
		return isArrived;
		
	}
	
	public void setArrived(boolean isArrived) {
		this.isArrived=isArrived;
		notifyObserver();
	}

}
