package com.example.algorithm_ex.Basic_01.Ex11_Sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i]; // 5
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 7};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
