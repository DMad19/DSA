package binarySearch;
import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(search(new int[] {1,1,1,2,3,4,5}, 2)));
    }
    static int[] search(int[] arr,int target){
        int[] ans = new int[2];
        ans[0] = binarySearch(arr,target,true);
        ans[1] = binarySearch(arr,target,false);
        return ans;
    }
    static int binarySearch(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                if(findStartIndex){
                    end = mid-1;      
                }
                else{
                    start = mid+1;
                }
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
}
