
/*
		- Create a program that uses an array List <Integer> to perform the following operation: 
		
		1) Add elements: adds numbers to the list (10,20,30,40,50);
		2) Insert elements: insert the elements at the 2nd index (25)
		3) Update element: update an element at index 3 to 35. 
		4) Remove: remove element by index Remove element at index 4.
		5) Remove element by value: Remove the value 10 from the list.
		6) Check element: check if the number 50 exist in the list.
		7) Retrive element: retrive element at 2n index.
		8) Sort the list in ascending order
		9) clear the list
		10) check if empty: verify if the list is empty. 
*/

import java.util.*;

public class IntegerClass{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();

		//1) Add elements: adds numbers to the list (10,20,30,40,50);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Initial list: " + list);

		//2) Insert elements: insert the elements at the 2nd index (25)
		list.add(2, 25);
		System.out.println("Array list after insertion at index 2: " + list);

		//3) Update element: update an element at index 3 to 35.
		list.set(3, 35);
		System.out.println("Array list after update at index 3: " + list);

		//4) Remove: remove element by index Remove element at index 4.
		list.remove(4);
		System.out.println("Array list after removing element at index 4: " + list);

		//5) Remove element by value: Remove the value 10 from the list.
		list.remove(Integer.valueOf(10));   //Converts primitive data tyhpe int to Integer
		System.out.println("Array list after removing value 10: " + list);
		
		//6) Check element: check if the number 50 exist in the list.
		System.out.println("Contains 50 ? : " + list.contains(50));
		
		//7) Retrive element: retrive element at 2n index.
		System.out.println("Value at index 2: " + list.get(2));
		
		//8) Sort the list in ascending order
		Collections.sort(list);
		System.out.println("Array list after sorting: " + list);
		
		//9) clear the list
		list.clear();
		System.out.println("Array list after clearing elements: " + list);
		
		//10) check if empty: verify if the list is empty.
		System.out.println("Is Array List empty ? : " + list.isEmpty());
	}
}
