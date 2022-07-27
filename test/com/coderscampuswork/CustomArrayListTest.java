package com.coderscampuswork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	private CustomList<Integer> sut;
	

	
	@Test
	void should_add_22_items_to_list_and_pass () {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i<11; i++) {
			customList.add(i);
		}
					
//		customList.remove(9);
//		customList.add(10);
//		customList.add(9, 100);
//		customList.add(9000);
//		customList.add(3, 10000);
//		customList.remove(3);
//		customList.remove(11);
//		customList.add(2000);
//		customList.add(13, 50000);
		
		assertEquals(customList.getSize(), 11);
	}
	
	@Test
	void should_get_item_and_pass() {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			customList.add(i);
		}
		assertEquals(customList.get(11), 11);
		
	}
	

	
	@Test
	void should_remove_from_end_of_arraylist() {
		CustomList<Integer> sut = new CustomArrayList<>();
		
		for (int i = 0; i < 1000; i++) {
			sut.add(i);
		}
		
		Integer itemRemoved = sut.remove(19);
		
		assertEquals(19, itemRemoved);
		
	}
	
	
	@Test
	void should_add_2items_and_pass () {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 1; i<1000; i++) {
			customList.add(i);
		}
		
		customList.add(1, -20);
		
		assertEquals(-20, customList.get(1));
		
	}
	
	@Test
	void should_add_items_to_list_and_pass () {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 0; i<11; i++) {
			customList.add(i);
		}
		
		assertEquals(customList.add(5), true);
	}
	
	
	
	// This is when it goes out of bounds but give the wrong exception
	
	
	
}
