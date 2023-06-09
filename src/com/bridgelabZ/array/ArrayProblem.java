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
        largestElement(arr,size);
        smallestElement(arr,size);
        evenPosition(arr,size);
        revArray(arr,size);
        oddPosition(arr,size);
        duplicateEle(arr,size);
        sortArray(arr,size);
        secondLarge(arr,size);
    }

    public static void printArray(int arr[], int size) {
        System.out.println("Array Elements are :");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
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
            System.out.println(arr[i] + " ==>  " + count);
        }
    }
    public static void largestElement(int arr[],int n){
        int large = arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("Largest Element in Array is :"+large);
    }
    public static void smallestElement(int arr[],int n){
        int small = arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest Element in Array is :"+small);
    }
    public static void evenPosition(int arr[],int n) {
        System.out.println("Even Position Elements Present  in Array is ");
        for (int i = 1; i < arr.length; i = i + 2)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }
    public static void revArray(int arr[],int n) {
        System.out.println("Reverse Element of an Array is : ");
        for (int i = arr.length-1; i>=0 ;  i--)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }

    public static void oddPosition(int arr[],int n) {
        System.out.println("Odd Position Elements Present  in Array are : ");
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }
    public static void duplicateEle(int arr[],int n) {
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void sortArray(int arr[],int n) {
        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Ascending order Elements oof Array are: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");

    }

    public static void secondLarge(int arr[],int n) {
        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Second Largest  Elements of Array is: "+arr[1]);

    }
}