package binarySearch;

public class InfiniteSortedArrayBrute {
    public static void main(String[] args) {
        System.out.println(bsearch(new int[] {1,2,3,4,5}, 4));
    }
    static int bsearch(int[] arr, int target){
        int i=0;
        while(arr[i]<=target){
            if(arr[i]==target){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
