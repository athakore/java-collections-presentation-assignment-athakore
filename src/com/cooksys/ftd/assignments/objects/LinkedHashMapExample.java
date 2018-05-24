
package com.cooksys.ftd.assignments.objects;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimerTask;

public class LinkedHashMapExample extends TimerTask {
	private static int ovenTime = 0;
	private static Map<String, Pizza> oven = new LinkedHashMap<String, Pizza>() {
		protected boolean removeEldestEntry(Map.Entry eldest) {
			for(Map.Entry<String, Pizza> entry: this.entrySet()) {
				if(entry.getValue().getCookTime() > 5) {
					System.out.println("~~Order #" + entry.getKey() + "'s " + entry.getValue().Cooked() + "~~");
					return true;
				}
			}
			return false;
		}
	};
	private static final List<Customer> customers = Collections.unmodifiableList(Arrays.asList(Customer.values()));
	private static final int size = customers.size();
	private static final Random rand = new Random();
	
	public void run() {
		if(ovenTime == 0)
			oven.put("natedaag", new Pizza());
		System.out.println(ovenTime + ":");
		for(Map.Entry<String, Pizza> order: oven.entrySet()) {
			System.out.println("Order #" + order.getKey() + "'s " + order.getValue().toString());
			order.getValue().Cook();
		}
		Set<String> setTemp = randomToppings();
		String[] toppingTemp = setTemp.toArray(new String[setTemp.size()]);
		oven.put("" + (ovenTime + 1), new Pizza(toppingTemp, randomSauce()));
		ovenTime++;
	}
	
	public enum Customer
	{
	    JK("Jason"),
	    MR("Matthew"),
	    CM("Cruz"),
	    MA("Mahdi"),
	    KS("Kyle"),
	    PD("Pat"),
	    ES("Evan"),
	    MB("Michael"),
		WM("Will");
	 
	    private String name;
	 
	    Customer(String name) {
	        this.name = name;
	    }
	 
	    public String getName() {
	        return name;
	    }
	}
	
	public static Customer randomCustomer() {
		return customers.get(rand.nextInt(size));
	}
	
	public static HashSet<String> randomToppings() {
		String[] possibleToppings = {"pepperoni", "sausage", "onion", "green pepper", "mushroom", "olive", "pineapple"};
		HashSet<String> result = new HashSet<String>();
		for(int i = 0; i < possibleToppings.length; i++) {
			result.add(possibleToppings[rand.nextInt(possibleToppings.length)]);
		}
		return result;
	}
	
	public static String randomSauce() {
		String[] possibleSauces = {"marinara", "alfredo", "barbecue", "pesto"};
		return possibleSauces[rand.nextInt(possibleSauces.length)];
	}
	
}
