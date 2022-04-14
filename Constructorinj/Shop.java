package com.te.Constructorinj;

public class Shop {
	
	private String items;
    private String name;
    private int amount;
    
	public Shop(String items, String name, int amount) {
		
		this.items = items;
		this.name = name;
		this.amount = amount;
	}
	public String getItems() {
		return items;
	}
	public String getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Shop [items=" + items + ", name=" + name + ", amount=" + amount + "]";
	}
	public Shop() {
		super();
		
	}
    
}
