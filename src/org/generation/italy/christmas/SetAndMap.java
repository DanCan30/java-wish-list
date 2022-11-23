package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SetAndMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type something: ");
		String userString = sc.nextLine();
		
		sc.close();
		
		Set<Character> stringSet = new HashSet<>();
		
		for( int i = 0; i < userString.length(); i++) {
			
			char c = userString.charAt(i);

			if( c != ' ') {
						
				stringSet.add(c); 
			}
		}
		
		String newString = "";

		
		List<Character> stringList = new ArrayList<>(stringSet);
		
		stringList.sort(null);

		
		for(Character c : stringList) {
			
			newString += c;

		}
		
		System.out.println("Input without doubled chars");
		System.out.println(stringSet);
		System.out.println("-----------------");
		System.out.println("Input with ordered chars");
		System.out.println(stringList);
		System.out.println("-----------------");
		System.out.println("Ordered input as an unique string");
		System.out.println(newString);
		System.out.println("\n\n\n------------------------\n\n\n");
		
		
		Map<Character, Integer> charCount = new TreeMap<>();
		
		for (int i = 0; i < userString.length(); i++) {
			int counter = 0;
			char c = userString.charAt(i);
			if(c != ' ') {
				
				for(int y = 0; y < userString.length(); y++) {
					if (c == userString.charAt(y)) {
						counter++;
					}
				}
				charCount.put(c, counter);
			}
		}
		
		System.out.println("Characters count: ");

		for (Character key : charCount.keySet()) {
			System.out.println("-" + key + ": " + charCount.get(key));
		}
		
	}
}
