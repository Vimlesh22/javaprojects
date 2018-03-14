package com.bridgelabz.utility;

import java.util.Map;

public class Customer
{
	private String name;
	private long money;
	private Map<String,Integer> shares;
	private long totalvalue;
	public Customer(String name, long money) 
	{
		super();
		this.name = name;
		this.money = money;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + ", shares=" + shares + ", totalvalue=" + totalvalue
				+ "]";
	}

}