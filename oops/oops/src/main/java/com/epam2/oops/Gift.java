package com.epam2.oops;
import java.util.*;

public class Gift {
	public int weight, price;
	public static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<Integer> wgt = new ArrayList<>();
	public static ArrayList<Integer> cost = new ArrayList<>();
	public void itemsInGift() {
		System.out.println("Items in Gift are:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public void totalWeight() {
		int totalWgt = 0;
		for(int i = 0; i < wgt.size(); i++) {
			totalWgt += wgt.get(i);
		}
		System.out.println("Total weight:"+totalWgt);
		
	}
	public void totalCost() {
		int totalCst = 0;
		for(int i = 0; i < cost.size(); i++) {
			totalCst += cost.get(i);
		}
		System.out.println("Total Cost:"+totalCst);
		
	}
	
	
}
