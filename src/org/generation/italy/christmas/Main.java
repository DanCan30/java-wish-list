package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

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
				wishlist.sort(null);
				System.out.println("Your final wishlist is: ");
				
				for(String element : wishlist) {
					System.out.println("-" + element);
				}
			}
		}
		sc.close();
	}
}
