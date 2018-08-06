package com.exilant.training.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection="book")
public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private double price;

}
