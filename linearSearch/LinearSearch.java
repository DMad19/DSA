package linearSearch;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {12,243,1,2,3,4,1,2,12};
        int target = 1;
        String s = "string";
        char tar = 's';
        int ans = linearSearchThroughArray(arr, target);
        System.out.println(ans);
        System.out.println(linearSearchThroughString(s, tar));
        int[][] arr2 = {
            {1,2,3},
            {4,5,6}
        };
        target = 8;
        System.out.println(Arrays.toString(linearSearchin2DArrays(arr2, target)));
    }
    static int linearSearchThroughArray(int[] arr,int target){
        if(arr == null){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int linearSearchThroughString(String s,char target){
        if(s.length() == 0){
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if(target == s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    static int[] linearSearchin2DArrays(int[][] arr,int target){
        if(arr.length == 0){
            return new int[] {-1,-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }    
        }
        return new int[] {-1,-1};
    }
}
