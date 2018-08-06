package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment2Part2 {
	
	public static int calculateSum(String spreadsheetPath) throws Exception {
		String line = "";

		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
			while ((line = br.readLine()) != null) {
				sum = sum + calculateDiv(line);
			}
		}

		return sum;
	}
		private static int calculateDiv(String row) {
			int division = 0;
			List<Integer> list = new ArrayList<Integer>();
			Arrays.stream(row.split(",")).forEach(i -> list.add(Integer.parseInt((i))));
			Collections.sort(list);
			System.out.println(list);
			for(int i=0;i<list.size()-1;i++) {
				for(int j=i+1;j<list.size();j++) {
					if(list.get(j)%list.get(i)==0) {
						 division=list.get(j)/list.get(i);

				}
			}
			}
			return division;
		}
		public static void main(String[] args) throws Exception {
			System.out.println(calculateSum("/Users/samas/Desktop/file7.csv"));
		}
	}


