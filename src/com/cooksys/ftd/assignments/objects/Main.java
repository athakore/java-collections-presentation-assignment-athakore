package com.cooksys.ftd.assignments.objects;

import java.util.Arrays;
import java.util.Timer;

public class Main {
	static Timer timer;
	
	public static void main(String[] args) {
		timer = new Timer();
		timer.schedule(new LinkedHashMapExample(),0, 5000);
	}
}
