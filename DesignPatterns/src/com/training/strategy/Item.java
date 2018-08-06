package com.training.strategy;

public class Item {

	private int itemId;
	private String itemName;
	private int price;
	private int qty;
	
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", qty=" + qty + "]";
	}
	public Item(int itemId, String itemName, int price, int qty) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	

}
