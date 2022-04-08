package com.coderscampuswork;

public class CustomArrayApplication {
	public static void main(String[] args) {
		CustomList<Integer> arrayNumbers = new CustomArrayList<>();
		
		// Instantiation to make it run from a size of 10 and make the array grow to 1000
		for (int i=1; i<=1000; i++) {
			arrayNumbers.add(i);
		}
		
		// print out result
		for (int i=0; i<arrayNumbers.getSize(); i++) {
			System.out.println(arrayNumbers.get(i));
		}
	}
}
