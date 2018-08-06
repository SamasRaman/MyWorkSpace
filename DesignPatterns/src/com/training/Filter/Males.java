package com.training.Filter;

import java.util.ArrayList;
import java.util.List;

public class Males implements ICriteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> maleList=new ArrayList<>();
		
		for(Person temp : persons) {
			if(temp.getSex().equals("male")) {
				maleList.add(temp);
			}
		}
		return maleList;
	}

}
