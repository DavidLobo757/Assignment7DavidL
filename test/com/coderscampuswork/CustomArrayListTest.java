package com.coderscampuswork;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;






class CustomArrayListTest {
	
	private CustomList<Integer> sut;
	@Test
	void should_add_22_items_to_list_and_pass () {
		// Arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		for (int i = 1; i<22; i++) {
			sut.add(i);
		}
		
		// Assert
	
		for(int i = 0; i<21; i++) {
			assertEquals(i+1, sut.get(i));
		}
		assertEquals(21, sut.getSize());
		
	}
	
	@Test
	void should_add_one_item_to_list_and_pass() {
		CustomList<Integer> customList = new CustomArrayList<>();
		
		customList.add(10);
		assertEquals(10, customList.get(0));
		assertEquals(1, customList.getSize());
		
	}

	
	@Test
	void should_not_throw_exception_out_of_bounds () {
		CustomList<Integer> sut = new CustomArrayList<>();
		try {
			sut.add(21, -5);
			fail("Expected an IndexOutOfBoundsException but did not get one.");
		} catch (IndexOutOfBoundsException e) {
			return;
		}
		fail("Expected an IndexOutOfBoundsException but did not get one.");
		
	}
	
	@Test
	void should_fail() {
		for (int i=0; i<1000000; i++) {
			sut.add(i);
		}
		sut.add(8000, -5);
		assertEquals(-5, sut.get(8000));
		assertEquals(343241, sut.getSize());
	}
}
