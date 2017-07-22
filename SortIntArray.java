package main;
import java.util.Arrays;
public class SortIntArray {
	public static void main(String[] args){
		
		//input the numbers to be sorted between the brackets with a comma inbetween each integer
		int[] numbers = {5,3,7,1,9,2,6,4,0,8};
		
		//Print the provided numbers
		System.out.println("The Integers provided:");
		for(int ctr = 0; ctr < numbers.length; ctr++){
			System.out.print(numbers[ctr]);
			}
		
		System.out.println();
		
		//Sort integers ascending 
		Arrays.sort(numbers);
		
		//Print sorted integers ascending
		System.out.println("The Integers Sorted (ascending):");
		for(int ctr = 0; ctr < numbers.length; ctr++){
			System.out.print(numbers[ctr]);
			}
		
		/*BONUS POINTS
		 * I am not going to sort the array in descending order 
		 * by simply reversing the ascending sorted array.*/
		System.out.println();
		System.out.println("The Integers Sorted (descending):");
		
		//Reverse Array
		for (int ctr = 0; ctr < numbers.length/2; ctr++){
			int temp = numbers[numbers.length-1-ctr];
			numbers[numbers.length-1-ctr] = numbers[ctr];
			numbers[ctr] = temp;
		}
		
		for (int ctr = 0; ctr < numbers.length; ctr ++){
			System.out.print(numbers[ctr]);
		}
	}

}
