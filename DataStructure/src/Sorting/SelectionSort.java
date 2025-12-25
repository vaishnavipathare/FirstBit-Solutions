package Sorting;

import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(int[] arr) {

        int passes = 0;       
        int comparisons = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int m_index = i;
            passes++;

            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;

                if (arr[j] < min) {
                    min = arr[j];
                    m_index = j;
                }
            }

            // swap
            arr[m_index] = arr[i];
            arr[i] = min;
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

        selectionSort(arr);

        System.out.println("Sorted Array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
