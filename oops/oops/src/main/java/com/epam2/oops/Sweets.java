package com.epam2.oops;

import java.util.*;

public class Sweets extends Gift {
	String name;
	public static TreeMap<String, Integer> ttm1 = new TreeMap<String, Integer>();
	public static TreeMap<String,Integer> ttm2 = new TreeMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);
	
    public Sweets() {
    	name = "";
    	price = 0;
    	weight = 0;
	}

	
	public Sweets(int price, int weight, String name) {
		super();
		this.price = price;
		this.weight = weight;
		this.name = name;
		list.add(name);
		wgt.add(weight);
		cost.add(price);
	    if(!ttm1.containsKey(name)) {
		    ttm1.put(name, weight);
		} else {
			ttm1.put(name, weight + ttm1.get(name));
				
		}
		if(!ttm2.containsKey(name)) {
			ttm2.put(name, price);
		} else {
			ttm2.put(name, price + ttm2.get(name));		
		}
	}
	
	
	public static void sortByWeight() {
		TreeMap<String, Integer> sortedMap = sortByValues(ttm1);
    	System.out.println(sortedMap);
		
	}
	
	public static void sortByPrice() {
		TreeMap<String, Integer> sortedMap = sortByValues(ttm2);
    	System.out.println(sortedMap);
		
	}
    private static TreeMap<String, Integer> sortByValues(TreeMap<String, Integer> tm12) {
		
		TreeMap<String, Integer> sortedMap = new TreeMap(new ValueComparator(tm12));
		sortedMap.putAll(tm12);
		return sortedMap;
	}	
    
    public static void priceRange() {
		TreeMap<String, Integer> sortedMap = sortByValues(ttm2);
		System.out.println("Enter the lower limit of the price:");
		int lwr_limit = sc.nextInt();
		System.out.println("Enter the higher limit of the price:");
		int hg_limit = sc.nextInt();
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			if(entry.getValue() >= lwr_limit && entry.getValue() <= hg_limit) {
				System.out.println(entry.getKey()+":"+entry.getValue()+"\n");
			}
		}
	}
	public static void weightRange() {
		TreeMap<String, Integer> sortedMap = sortByValues(ttm1);
		System.out.println("Enter the lower limit of the weight:");
		int lwr_limit = sc.nextInt();
		System.out.println("Enter the higher limit of the weight:");
		int hg_limit = sc.nextInt();
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			if(entry.getValue() >= lwr_limit && entry.getValue() <= hg_limit) {
				System.out.println(entry.getKey()+":"+entry.getValue()+"\n");
			}
		}
	}
	

}

