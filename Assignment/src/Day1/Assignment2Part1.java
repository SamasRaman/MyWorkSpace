package Day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment2Part1 {

	public static int calculateSum(String spreadsheetPath) throws Exception {
		String line = "";

		int sum = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
			while ((line = br.readLine()) != null) {
				sum = sum + calculateDiff(line);
			}
		}

		return sum;
	}

	private static int calculateDiff(String row) {
		int difference = 0;
		// row = row.replace(&quot;,&quot;, &quot;&quot;);
		List<Integer> list = new ArrayList<Integer>();
		Arrays.stream(row.split(",")).forEach(i -> list.add(Integer.parseInt((i))));
		
		Collections.sort(list);
		System.out.println(list);
		int max = list.get(list.size() - 1);
		int min = list.get(0);
		difference = max - min;
		System.out.println(difference);
		return difference;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(calculateSum("/Users/samas/Desktop/filenew.csv"));
	}

}
// /Users/samas/Desktop
