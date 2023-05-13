package com.bridgelabZ.array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int size = arr.length;
        System.out.println("Enter the Elements in the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, size);
        countFreq(arr, size);
    }

    public static void printArray(int arr[], int size) {
        System.out.println("Array Elements are :");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        System.out.println("Frequency count of array elements is :");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "  " + count);
        }
    }
}
