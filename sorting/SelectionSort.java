package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,-3,-2,-1};
        SSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxIndex = getMaxIndex(arr,0,arr.length-i-1);
            swap(arr,maxIndex,arr.length-i-1);
        }
    }
    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
