package com.cooksys.ftd.assignments.objects;

import java.util.*;

public class Main {
	static Timer timer;
	
	public static void main(String[] args) {
		timer = new Timer();
//		ArrayListExample();
//		HashSetExample();
//		HashMapExample();
		timer.schedule(new LinkedHashMapExample(),0, 5000);
	}
	
	public static void ArrayListExample() { //...Do I really have to come up with ANOTHER implementation of an ArrayList at this point?
		List<Character> listExample = new ArrayList<Character>(); 
		listExample.add('B'); //Duplicate
		listExample.add('A');
		listExample.add('D');
		listExample.add('B'); //Duplicate
//		listExample.add(null); //ArrayList will accept a null value as a value.
		for(int i = 0; i < listExample.size(); i++) { //While a LinkedList iterates through the use of pointers, ArrayList iterates using sequential indices for its entries.
			System.out.println("Index " + i + " contains " + listExample.get(i)); //This gives the user the ability to create functions that use counters.
		}
		System.out.println("---");
		Collections.sort(listExample);
		for(int i = 0; i < listExample.size(); i++) { //While a LinkedList iterates through the use of pointers, ArrayList iterates using sequential indices for its entries.
			System.out.println("Index " + i + " contains " + listExample.get(i)); //This gives the user the ability to create functions that use counters.
		}
	}
	
	public static void HashSetExample() { //Bingo
		Set<String> setExample = new HashSet<String>();
		setExample.add("B-2"); 
		setExample.add("B-13"); 
		setExample.add("B-45"); 
		setExample.add("I-10");
		setExample.add("I-28");
		setExample.add("I-73"); //Duplicate entry
		setExample.add("I-73"); //Duplicate entry
		setExample.add("G-13");
		setExample.add("G-11");
		setExample.add("G-9");
//		setExample.addAll(null); //HashSet will accept a null value, as well.
		setExample.get(4); //HashSet does not track insertion order, therefore, it is not possible to call an entry by index.
		Iterator<String> iterator = setExample.iterator(); //Retrieving from a HashSet requires the use of an iterator essentially reach into the set and pull out a random value.
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		Collections.sort(setExample);
	}
	
	public static void HashMapExample() { //VendingMachine
		Map<String, String> mapExample = new HashMap<String, String>();
		mapExample.put("A1", "Coke");
		mapExample.put("A2", "Pibb Xtra");
		mapExample.put("A3", "Sprite");
		mapExample.put("A4", "Mello Yello");
		mapExample.put("A5", "Powerade");
//		mapExample.put("A5", "Powerade");
//		mapExample.put("A5", "Hi-C");
		mapExample.put("A6", null); //HashMap will accept a null value
		mapExample.put(null, "Beverly"); //And accept a null key.
		mapExample.get(5); //Like the HashSet, MashMap does not track insertion order.
		System.out.println(mapExample.get("A5"));
		System.out.println(mapExample.get("A6"));
		System.out.println(mapExample.get(null));
		Collections.sort(mapExample);
	}
}
