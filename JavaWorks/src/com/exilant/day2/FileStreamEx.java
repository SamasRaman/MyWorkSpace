package com.exilant.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreamEx {
public static void main(String[] args) throws IOException {
	Files.list(Paths.get("."))
	.map(Path :: getFileName)
	.forEach(System.out::println);
	
	System.out.println(".................");
	Files.list(Paths.get("."))
	.map(Path :: getFileName)
	.map(Path :: toString)
	.map(String :: toUpperCase)
	.filter(name->name.endsWith("TXT"))  //SAMPLE.TXT NEWSAMPLE>TXT
	.sorted().skip(1)					 //SAMPLE>TXT
	.limit(5)
	.forEach(System.out::println);
	
	
	//Given a file name,show the content of same 
	//and only show those lines which has exilant (either in uppercase or lower case)
	/*Files.list(Paths.get("."))
	.map(Path :: getFileName)
	.map(Path :: toString)
	.map(String :: toUpperCase)
	.filter(name->name.endsWith("TXT"))
	.sorted().
	*/
}
}
