package com.exilant.day2;

public interface IEmployee {
   public void salary();
   
   default void noOfHrs() {
	   System.out.println("Every employee Has to work for 8 hrs");
   }
   static void commonUtility() {
	   System.out.println("All Employee Has To Pass Background Verification");
   }
}
