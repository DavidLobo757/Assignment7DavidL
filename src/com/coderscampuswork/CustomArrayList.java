package com.coderscampuswork;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arrayLength = 0;
	
	@Override
	public boolean add(T item) {
		return add(arrayLength, item);
	}

	private Object[] growBackingOfArray() {
		Object[] newArray = new Object[arrayLength * 2];
		for (int i=0; i<arrayLength; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	
	public int getSize() {
		return arrayLength;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException{
		if (index > arrayLength) 
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index > arrayLength) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}		
		if(arrayLength == items.length) {
			items = growBackingOfArray();
		}
		for (int i = arrayLength-1; i>=index; i--) {
			items[i+1] = items[i];
		}
		
		items[index] = item;
		arrayLength++;
		return true;
	}
	
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= arrayLength) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}	
		@SuppressWarnings("unchecked")
		T removedItem = (T) items[index];
		for (int i = index; i < arrayLength-1; i++) {
			items[i] = items[i + 1];
		}
		arrayLength--;
		items[index] = null;
		
		return removedItem;
		
		
	}
	
	
	
	
}