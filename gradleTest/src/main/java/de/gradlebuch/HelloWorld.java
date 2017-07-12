package de.gradlebuch;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
	
	public static void main(String[] args){
		HelloWorld hw = new HelloWorld();
		for(String greeting : hw.generateGreetingsData())
			System.out.println(greeting);
	}
	
	public List<String> generateGreetingsData() {
		List<String> greetings = new ArrayList<String> ();
		greetings.add("Hallo Welt");
		return greetings;
	}


}