package com.DynamicArray;

public class DynamicArrayUsecase {

	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		
		for(int i= 0; i<15; i++) {
			d.add(i+ 25);
		}
    
    /**********************
    d.isEmpty();
		d.size();
		d.print();
		d.add(number);
		d.set(index, number);
		d.get(index);
		d.removeLast();
		d.remove(index);
    *************************/
		System.out.println(d.size());
		System.out.println(d.isEmpty());
		d.print();

		System.out.println(d.get(14));
		d.set(3,40);
		d.print();

		System.out.println(d.size());
		d.set(1,100);
		d.print();

		System.out.println(d.size());
		d.set(40, 999);
		d.print();
		System.out.println(d.size());
		
		d.removeLast();
		d.print();
		System.out.println(d.size());

		d.remove(0);
		d.print();
		System.out.println(d.size());
		
	}

}

