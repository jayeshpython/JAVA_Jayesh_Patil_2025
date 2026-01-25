

/*

		*** Map of Numbers and their Squares ***
		
	Problem Statement: 

	- Write a method that accepts an array of numbers and returns a map where each numbers is a key and its square is the value.
	
	- Method Details: 
			Method Name: getSquares.
			Method Description: Create a map with numbers & their squares
			Input: int[]numbers
			Return Type: Map<Integer,Integer>
			
    - Logic: Iterate through the array, calculate the square of each number and add it to a HashMap 


*/

import java.util.*;

class ArrayNumbers{
    int size;
	int[] arr;

	public ArrayNumbers(int n){

		Scanner sc = new Scanner(System.in);
		size = n;
		arr = new int[n];

		System.out.println("Enter values in array: ");
		for(int i = 0; i < n;i++){
			arr[i] = sc.nextInt();
		}
	}

	public HashMap<Integer, Integer> getSquares(){

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int num: arr){
			map.put(num, num*num);
		}
		return map;
	}
}

public class MapSquareClass{
	public static void main(String[] args) {
		
		ArrayNumbers arr = new ArrayNumbers(7);

		HashMap<Integer, Integer> result = arr.getSquares();
		System.out.println("\nArray numbers and thier squares: ");
		System.out.println(result.entrySet());
	}
}

