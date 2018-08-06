package com.training.strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
public static void main(String[] args) {
	
	List<Item> items= Stream.of(new Item(101,"pen",30,4), new Item(102,"Monitor",3000,2)).collect(Collectors.toList());
	
ShoppingCart shoppingCart=new ShoppingCart();
shoppingCart.addItem(new Item(101,"Pen",30,4));
shoppingCart.addItem(new Item(102,"monitor",4000,2));
shoppingCart.addItem(new Item(103,"Bottle",60,1));

System.out.println("Total Amount::"+shoppingCart.calculateTotal());
Payment paymentStrategy=new EWallet("samas.r@gmail.com","secret@123","CCAvenue");
shoppingCart.checkOut(paymentStrategy);

}
}
