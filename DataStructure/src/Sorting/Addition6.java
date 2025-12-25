package Sorting;

import java.util.Scanner;

public class Addition6 {

    private static void addition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 6) {
                    System.out.println("Addition of elements is 6 are: " + arr[i] + " + " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        addition(arr);
    }
}
