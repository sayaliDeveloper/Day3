package com.bridgelabZ.assignment;

import java.util.Scanner;
public class SecondHigh {
    public static void main(String[] args) {
        int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("How many Element you want to Enter in  Array :");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter the Elements in the Arrays");
        for (int i = 0; i < n ; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements Are :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Highest Element of Array is " + arr[1]);

    }
}
