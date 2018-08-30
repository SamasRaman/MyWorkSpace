package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThenComparing {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(101,"samas",6000));
		emp.add(new Employee(102,"samas",5000));
		emp.add(new Employee(103,"alam",6000));
		emp.add(new Employee(104,"alam",4000));
		
		Comparator<Employee> byName=(e1,e2)-> {
			return e1.getEmpName().compareTo(e2.getEmpName());
	};
	
	Comparator<Employee> bySal=(e1,e2)-> {
		return  (int) (e1.getEmpSal()-e2.getEmpSal());
};
				
     Comparator<Employee> byNameThenSal=byName.thenComparing(bySal);	
     Collections.sort(emp,byNameThenSal);
     emp.forEach(e-> System.out.println(e));
	}

}
