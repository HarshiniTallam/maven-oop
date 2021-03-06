package com.epam2.oops;
import java.util.*;
public class GiftAnalysis {
	static Scanner sc = new Scanner(System.in);
	static void inputSweets() {
		System.out.println("Enter number of sweets:");
		int scount = sc.nextInt();
		for(int i = 0; i < scount; i++) {
			System.out.println("Enter the sweet name:");
			String name = sc.next();
			System.out.println("Enter the price:");
			int p = sc.nextInt();
			System.out.println("Enter the weight:");
			int w = sc.nextInt();
			new Sweets(p, w, name);
		}
	}
	
	static void inputChocolates() {
		System.out.println("Enter number of chocolates:");
		int scount = sc.nextInt();
		for(int i = 0; i < scount; i++) {
			System.out.println("Enter the chocolate name:");
			String name = sc.next();
			System.out.println("Enter the price:");
			int p = sc.nextInt();
			System.out.println("Enter the weight:");
			int w = sc.nextInt();
			new Chocolates(p, w, name);
		}
	}
	
	
	public static void main(String args[]) {
		inputSweets();
		inputChocolates();
		int s = 1;
		while(s == 1) {
			System.out.println("1.sort chocolates by weight"+"\n"+"2.sort chocolates by price"+"\n"+"3.sort sweets by weight"+"\n"+"4.sort sweets by price"+"\n"+"5.Items in gift"+"\n"+"6.total weight"+"\n"+"7.total price"+"\n"+"8.chocolates with in price range"+"\n"+"9.chocolates with in weight range"+"\n"+"10.sweets with in price range"+"\n"+"11.sweets with in weight range"+"\n");
			System.out.println("Enter your option:");
			int op = sc.nextInt();
			Gift obj1 = new Gift();
			Chocolates obj2 = new Chocolates();
			Sweets obj3 = new Sweets();
			if(op == 1) {
				obj2.sortByWeight();
				
			} else if(op == 2) {
				obj2.sortByPrice();
				
			} else if(op == 3) {
				obj3.sortByWeight();
			} else if(op == 4) {
				obj3.sortByPrice();
			} else if(op == 5) {
				obj1.itemsInGift();
			} else if(op == 6) {
				obj1.totalWeight();
			} else if(op == 7) {
				obj1.totalCost();
			} else if(op == 8) {
				obj2.priceRange();
			} else if(op == 9) {
				obj2.weightRange();
			} else if(op == 10) {
				obj3.priceRange();
			} else if(op == 11) {
				obj3.weightRange();
			} else {
				System.out.println("Plz enter valid option");
			}
			System.out.println("To continue press 1 otherwise 0:\n");
			s = sc.nextInt();
		}
	}

}
