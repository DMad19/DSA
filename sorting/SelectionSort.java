package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(ssort(arr)));
    }
    static int[] ssort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            //find max item position
            int max = findmax(arr, i);
            //swap max ele with last len-i-1 index
            swap(arr, max, arr.length-i-1);
        }
        return arr;
    }
    static int findmax(int[] arr,int i){
        int max = 0;
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
        }
        return max;
    }
    static void swap(int[] arr,int max,int posToSwap){
        int temp = arr[posToSwap];
            arr[posToSwap] = arr[max];
            arr[max] = temp;
    }
}
