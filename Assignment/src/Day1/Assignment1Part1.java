package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1Part1 {
	public static int findNumber(String str) {
		
		int sum=0;
		for(int i=0;i<str.length()-1;i++) {
			
			
				if(str.charAt(i)==str.charAt(i+1)) {
					
					sum+=Integer.parseInt(str.substring(i,i+1));
					
				}//if
				
				
				if(i+2==str.length()) {
					
					if(str.charAt(0)==str.charAt(str.length()-1)) {
						sum+=Integer.parseInt(str.substring(0,1));
					}//if
					
				}//if
				
				
			}//for
		

		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entere the no:");
		String no=sc.nextLine();
		
		System.out.println(Assignment1Part1.findNumber(no));
	}

}
