package com.DynamicArray;

public class DynamicArray {
	
	private int data[];
	private int nextElementIndex;
	
	// DynamicArray constructor
	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}
	
	// add number in array
	public void add(int num) {
		if(nextElementIndex == data.length) {
			resize();
		}
		data[nextElementIndex] = num;
		nextElementIndex++;
	}
	
	// doubling the size of array
	private void resize() {
		int temp[] = data;
		 data = new int[temp.length * 2];
		 for(int i = 0; i<temp.length; i++) {
			 data[i] = temp[i];
		 }
	}
	
	// returning the size of array
	public int size() {
		return nextElementIndex;
	}
	
	// check array is empty or not
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	// get element from array via index
	public int get(int index) {
		if(index < nextElementIndex) {
			return data[index];
		}
		System.out.print("index out of bound");
		return -1;
	}
	
	// set number at particular index,
	//if index out of bound than increasing the size of array till that particular index
	public void set(int index, int number) {
		if(index >= nextElementIndex && index >= data.length) {
			newArray(index);
			data[index] = number;
			nextElementIndex = index+1;
			return;	
		}
		for(int i=nextElementIndex-1; i>= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = number;
		nextElementIndex++;		
	}
	
	private void newArray(int index) {
		int temp[] = data;
		data = new int[index+1];
		for(int i = 0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	// removing the last element from array and return that element
	public int removeLast() {
		if(nextElementIndex == 0) return -1;
		int temp = data[nextElementIndex-1];
		data[nextElementIndex-1] = 0;
		nextElementIndex--;
		return temp;
	}
	
	//remove element from array in any index and return that element
	public int remove(int index) {
		if(nextElementIndex == 0 || index >= nextElementIndex) return -1;
		
		int temp = data[index];
		for(int i = index; i<nextElementIndex-1; i++) {
			data[i] = data[i+1]; 
		}
		nextElementIndex--;
		return temp;	
	}
	
	
	// print the array
	public void print() {
		for(int i= 0; i<nextElementIndex-1; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println(data[nextElementIndex-1]);
	}

}
