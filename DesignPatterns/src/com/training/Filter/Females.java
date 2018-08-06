package com.training.Filter;

import java.util.ArrayList;
import java.util.List;

	public class Females implements ICriteria {

		@Override
		public List<Person> meetCriteria(List<Person> persons) {
			List<Person> femaleList=new ArrayList<>();
			
			for(Person temp : persons) {
				if(temp.getSex().equals("female")) {
					femaleList.add(temp);
				}
			}
			return femaleList;
		}

	}


