package Sorting;

import java.util.Scanner;

public class InsertionSort {
	
	 static void InsertionSort(int[] arr){
		 for(int i =1; i<arr.length; i++) {
			int x = arr[i];
			int j= i-1;
			while(j>=0) {
				if(arr[j] > x) {
					arr[j+1] = arr[j];
					j--;
				}
				else {
					break;
				}
				
			} arr[j+1] = x;
			
		 } 
		 
	  }
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[4];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        InsertionSort(arr);

	        System.out.println("Sorted Array:");
	        for (int x : arr)
	            System.out.print(x + " ");
	    }


}
