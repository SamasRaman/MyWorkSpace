package com.exilant.day2;

public class LargerString{
	public static void getLargest(String s1,String s2, GreaterString gs) {
	
		
		gs.findLargerString(s1, s2);
		
		
}
	public static void main(String[] args) {
		System.out.println("hi");
		GreaterString gs = (s1, s2) -> {
			if(s1.length()>s2.length()) {
				System.out.println("s1 is greter");
			}
			else
			{
				System.out.println("s2 is greter");
			}
			
			
		};
		LargerString.getLargest("samas","ramana",  gs);
	}
}



