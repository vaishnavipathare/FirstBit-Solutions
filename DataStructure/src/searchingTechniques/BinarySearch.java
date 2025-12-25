package searchingTechniques;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int[] arr, int x) {
	    int start = 0;
	    int end = arr.length - 1;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (arr[mid] == x) {
	            return mid;   // element found
	        }
	        else if (x < arr[mid]) {
	            end = mid - 1;
	        }
	        else {
	            start = mid + 1;
	        }
	    }

	    return -1;  // element not found
	}
	
	static int binarySearchRecursive(int[] arr, int x, int start, int end) {
	    if (start > end) {
	        return -1;
	    }

	    int mid = start + (end - start) / 2;

	    if (arr[mid] == x) {
	        return mid;
	    }
	    else if (x < arr[mid]) {
	        return binarySearchRecursive(arr, x, start, mid - 1);
	    }
	    else {
	        return binarySearchRecursive(arr, x, mid + 1, end);
	    }
	}

	static int firstOccurrence(int[] arr, int x) {
	    int start = 0, end = arr.length - 1;
	    int result = -1;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (arr[mid] == x) {
	            result = mid;      // store index
	            end = mid - 1;     // shift LEFT
	        }
	        else if (x < arr[mid]) {
	            end = mid - 1;
	        }
	        else {
	            start = mid + 1;
	        }
	    }
	    return result;
	}
	
	
	static int lastOccurrence(int[] arr, int x) {
	    int start = 0, end = arr.length - 1;
	    int result = -1;

	    while (start <= end) {
	        int mid = start + (end - start) / 2;

	        if (arr[mid] == x) {
	            result = mid;      // store index
	            start = mid + 1;   // shift RIGHT
	        }
	        else if (x < arr[mid]) {
	            end = mid - 1;
	        }
	        else {
	            start = mid + 1;
	        }
	    }
	    return result;
	}
	
//	Why left shift?
//			To check if the same element exists earlier.
//
//			Why right shift?
//			To check if the same element exists later.
//
//			Why recursive?
//			Binary search follows divide-and-conquer naturally.



}

class Test{
	public static void main(String[] args) {
		
		BinarySearch l1 = new BinarySearch();
		
	    Scanner sc = new Scanner(System.in);

	    int[] arr = new int[8];
	    System.out.println("Enter the array elements (sorted):");
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = sc.nextInt();
	    }

	    System.out.println("Enter the element you want to search:");
	    int x = sc.nextInt();

	    int result = l1.binarySearch(arr, x);

	    if (result != -1) {
	        System.out.println("Element found at index: " + result);
	    } else {
	        System.out.println("Element not found");
	    }
	}

}