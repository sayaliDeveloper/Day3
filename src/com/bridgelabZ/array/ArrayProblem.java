package com.bridgelabZ.array;

import java.util.Scanner;

public class ArrayProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[5];
        int size = arr.length;
        System.out.println("Enter the Elements in the array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr, size);
    }

   public static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

}

