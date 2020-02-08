package com.epam2.oops;

import java.util.Comparator;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Chocolates extends Gift {
	String name;
	
	public static TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();
	public static TreeMap<String, Integer> tm2 = new TreeMap<String, Integer>();
	static Scanner sc = new Scanner(System.in);
	public Chocolates() {
		name = "";
		price = 0;
		weight = 0;
	}

	public Chocolates(int price, int weight, String name) {
		super();
		this.price = price;
		this.weight = weight;
		this.name = name;
		list.add(name);
		wgt.add(weight);
		cost.add(price);
		if(!tm1.containsKey(name)) {
			tm1.put(name, weight);
		} else {
			tm1.put(name, weight + tm1.get(name));
			
		}
		if(!tm2.containsKey(name)) {
			tm2.put(name, price);
		} else {
			tm2.put(name, price + tm2.get(name));	
		}
		
	}

    public static void sortByWeight() {
    	TreeMap<String, Integer> sortedMap = sortByValues(tm1);
    	System.out.println(sortedMap);
		
	}
	
	private static TreeMap<String, Integer> sortByValues(TreeMap<String, Integer> tm12) {
		
		TreeMap<String, Integer> sortedMap = new TreeMap(new ValueComparator(tm12));
		sortedMap.putAll(tm12);
		return sortedMap;

	}

	public static void sortByPrice() {
		TreeMap<String, Integer> sortedMap = sortByValues(tm2);
    	System.out.println(sortedMap);
		
	}
	
	public static void priceRange() {
		TreeMap<String, Integer> sortedMap = sortByValues(tm2);
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
		TreeMap<String, Integer> sortedMap = sortByValues(tm1);
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
class ValueComparator implements Comparator {
	Map map;
	public ValueComparator(Map map) {
	    this.map = map;
	}
	public int compare(Object keyA, Object keyB) {
	    Comparable valueA = (Comparable) map.get(keyA);
	    Comparable valueB = (Comparable) map.get(keyB);
	    return valueB.compareTo(valueA);
	}
}
