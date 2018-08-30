package com.exilant.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
public static void main(String[] args) throws IOException {
	writeToFile01();
	readFromFile();
}

public static void writeToFile() throws IOException {
	BufferedWriter bw=null;
	try {
		bw=new BufferedWriter(new FileWriter("/Users/samas/Desktop/JavaWorks/JavaWorks/src/NewSample.txt"));
		bw.write("Hello");
		bw.newLine();
		bw.write("How are u");
		bw.newLine();
		bw.write("its nice weather in bengalore");
		bw.newLine();
		
	}catch(IOException ieo) {
		ieo.printStackTrace();
	}finally{
		try {
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
	}
}
}

//java 8 features
public static void writeToFile01() throws IOException {
	
	try(BufferedWriter bw=new BufferedWriter(new FileWriter("/Users/samas/Desktop/JavaWorks/JavaWorks/src/NewSample1.txt"))){
		bw.write("Hello");
		bw.newLine();
		bw.write("How are u");
		bw.newLine();
		bw.write("its nice weather in bengalore");
		bw.newLine();
	}
	System.out.println("Data Saved Successfully");

}
public static void readFromFile() throws IOException{
	
	try(
			FileReader fr=new FileReader("/Users/samas/Desktop/JavaWorks/JavaWorks/src/NewSample1.txt");
			BufferedReader br=new BufferedReader(fr);) {
		br.lines().forEach(System.out::println);
	}
	
	
	
	
}
}
