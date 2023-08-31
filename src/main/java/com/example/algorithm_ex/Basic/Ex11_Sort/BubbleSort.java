package com.example.algorithm_ex.Basic.Ex11_Sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int N = arr.length;

        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
