package com.example.algorithm_ex.Basic_01.Ex11_Sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        int N = arr.length;
        for(int i=0; i<N-1; i++){
            int minindex = i;
            for(int j=i+1; j< N; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
