package Sorting;

import java.util.Scanner;

public class MergeSort {
	static void combine(int[] arr, int start, int mid,int end ) {
		int i=start;
		int j=mid+1, k=0;
		int[] n_arr = new int[end - start + 1];
		while(i<=mid && j <= end) {
			if(arr[i] <= arr[j]) {
				n_arr[k] = arr[i];
				i++;
				k++;
			}
			else {
				n_arr[k] = arr[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			n_arr[k] = arr[i];
			i++;
			k++;
		}
		while(j<=end) {
			n_arr[k] = arr[j];
			j++;
			k++;
		}
		
		int y=start;
		for(int x=0; x<n_arr.length;x++) {
			arr[y] = n_arr[x];
			y++;
		}
		
		
	}
	
	static void merge(int[] arr, int start,int end) {
		if(start<end) {
			int mid = (start+end)/2;
			 merge(arr, start, mid);
             merge(arr, mid + 1, end);
             combine(arr, start, mid, end);
			
		}
	}	
	  public static void main(String[] args) {
		  
		    Scanner sc = new Scanner(System.in);

		    int[] arr = new int[7];
		    System.out.println("Enter the array elements :");
		    for (int i = 0; i < arr.length; i++) {
		        arr[i] = sc.nextInt();
		    }
		  
//		  	        int[] arr = {38, 27, 43, 3, 9, 82, 10};
		    
		  	        System.out.println("Before Sorting:");
		  	        for (int num : arr)
		  	            System.out.print(num + " ");
		  
		  	        merge(arr, 0, arr.length - 1);
		  
		  	        System.out.println("\nAfter Sorting:");
		  	        for (int num : arr)
		  	            System.out.print(num + " ");
		  	    }
		  	}
	

//	    static void mergeSort(int[] arr, int left, int right) {
//	        if (left < right) {
//	            int mid = left + (right - left) / 2;
//	            mergeSort(arr, left, mid);
//	            mergeSort(arr, mid + 1, right);
//	            merge(arr, left, mid, right);
//	        }
//	    }
//	    static void merge(int[] arr, int left, int mid, int right) {
//	        int n1 = mid - left + 1;
//	        int n2 = right - mid;
//	        int[] L = new int[n1];
//	        int[] R = new int[n2];
//	        for (int i = 0; i < n1; i++)
//	            L[i] = arr[left + i];
//	        for (int j = 0; j < n2; j++)
//	            R[j] = arr[mid + 1 + j];
//	        int i = 0, j = 0, k = left;
//	        while (i < n1 && j < n2) {
//	            if (L[i] <= R[j]) {
//	                arr[k] = L[i];
//	                i++;
//	            } else {
//	                arr[k] = R[j];
//	                j++;
//	            }
//	            k++;
//	        }
//	        while (i < n1) {
//	            arr[k] = L[i];
//	            i++;
//	            k++;
//	        }
//
//	        while (j < n2) {
//	            arr[k] = R[j];
//	            j++;
//	            k++;
//	        }
//	    }
//	    public static void main(String[] args) {
//	    	
//	    	Scanner sc = new Scanner(System.in);
//
//		    int[] arr = new int[7];
//		    System.out.println("Enter the array elements:");
//		    for (int i = 0; i < arr.length; i++) {
//		        arr[i] = sc.nextInt();
//		    }
//
//
////	        int[] arr1 = {38, 27, 43, 3, 9, 82, 10};
//
//	        System.out.println("Before Sorting:");
//	        for (int num : arr)
//	            System.out.print(num + " ");
//
//	        mergeSort(arr, 0, arr.length - 1);
//
//	        System.out.println("\nAfter Sorting:");
//	        for (int num : arr)
//	            System.out.print(num + " ");
//	    }
//	}
//
//
