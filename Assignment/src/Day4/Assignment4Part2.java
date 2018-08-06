package Day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment4Part2 {

	public static int calculate(String spreadsheetPath) throws Exception {
		String line = "";
        int count=0;
		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
			while ((line = br.readLine()) != null) {
				sum =  calculateSum(line);
				System.out.println(sum);
				if( sum==0) {
					count++;
				}
			}
		}

		return count;
	}
	
	private static int calculateSum(String row) {
		int count1 = 0;
		List<String> list = new ArrayList<String>();
		List<String> list1= new ArrayList<String>();
		Arrays.stream(row.split(",")).forEach(i -> list.add((i)));
		System.out.println(list);
		for(int k=0;k<list.size();k++) {
			char[] ch=list.get(k).toCharArray();
			Arrays.sort(ch);
			String a=new String(ch);
			list1.add(a);
		}
		for(int i=0;i<list1.size()-1;i++) {
			for(int j=i+1;j<list1.size();j++) {
				if(list1.get(i).equals(list1.get(j))) {
					 count1++;
				}
			}
		}
		return count1;
	}
	public static void main(String[] args) throws Exception{
		System.out.println(calculate("/Users/samas/Desktop/file9.csv"));
	}
	}

