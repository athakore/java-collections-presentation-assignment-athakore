package com.cooksys.ftd.assignments.objects;

public class Pizza {
	private String[] toppings;
	private String sauce;
	private int cookTime;
	
	public Pizza() {
		this.toppings = new String[]{"O-Cheese!"};
		this.sauce = "marinara";
		this.cookTime = 0;	
	}
	
	public Pizza(String[] toppings, String sauce) {
		this.toppings = toppings;
		this.sauce = sauce;
		this.cookTime = 0;
	}
	
	public String[] getToppings() {
		return toppings;
	}
	
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public int getCookTime() {
		return cookTime;
	}
	
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	
	public void Cook() {
		this.cookTime++;
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < toppings.length; i++) {
			if( i < toppings.length - 1)
				result += toppings[i] + ", ";
			else if(i == toppings.length - 1 && toppings.length != 1)
				result += "and " + toppings[i];
			else
				result += toppings[i];
		}
		result += " pizza with " + sauce + " sauce has been cooking for " + cookTime + " minutes.";
		return result;
		
	}
	
}
