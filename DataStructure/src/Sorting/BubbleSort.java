package Sorting;

import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr) {

        int passes = 0;        // outer loop iterations
        int comparisons = 0;  // inner loop comparisons

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            passes++;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                comparisons++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap happened → already sorted
            if (swapped == false) {
                System.out.println("Array sorted in one pass, stopping early.");
                break;
            }
        }

        System.out.println("Total passes (iterations): " + passes);
        System.out.println("Total comparisons: " + comparisons);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
