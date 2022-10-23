package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        csort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void csort(int[] arr){
        int i=0;
        while(i<arr.length-1){
            int correct = arr[i]-1;
            if(i!=correct){ //According to kunal: arr[i]!=arr[correct]
                swap(arr,i,correct);
            }
            else{
                i+=1;
            }
        }
    }
    static void swap(int[] arr,int actual,int correct){
        int temp = arr[actual];
        arr[actual] = arr[correct];
        arr[correct] = temp;
    }
}
