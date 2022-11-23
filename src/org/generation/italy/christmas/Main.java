package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static class StringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {

			int o1VowelCount = 0;
			int o2VowelCount = 0;
			
			for(int i = 0; i < o1.length(); i++) {
				
				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' ||
						o1.charAt(i) == 'o' || o1.charAt(i) == 'u') {
					o1VowelCount ++;
				}
			}
			
			for(int i = 0; i < o2.length(); i++) {
				
				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' ||
						o2.charAt(i) == 'o' || o2.charAt(i) == 'u') {
					o2VowelCount ++;
				}
			}
			
			return o2VowelCount - o1VowelCount;
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		List<String> wishlist = new ArrayList<>();
		
		while(!done) {
			System.out.print("Insert a new item for your wishlist: ");
			String item = sc.nextLine();
			
			wishlist.add(item);
			System.out.println("-------------------");
			System.out.println("You have " + wishlist.size() + " element" 
			+ (wishlist.size() ==1 ? " " : "s ") + "in your wishlist");
			
			System.out.println("-------------------");
			
			System.out.println("Do you want to add more items? (y/n)");
			String userChoice = sc.nextLine();
			
			if(userChoice.equals("n")) {
				done = true;
				wishlist.sort(new StringComparator());
				System.out.println("Your final wishlist ordered by vowels count is: ");
				
				for(String element : wishlist) {
					System.out.println("-" + element);
				}
			}
		}
		sc.close();
	}
}
