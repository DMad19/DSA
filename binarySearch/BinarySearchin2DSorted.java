package binarySearch;
import java.util.Arrays;
public class BinarySearchin2DSorted {
    public static void main(String[] args) {
        int[][] m = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(m,target)));
    }
    static int[] bsearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[] {row,mid};
            }
            else if(matrix[row][mid]>target){
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rStart = 0;
        int rEnd = matrix.length-1;
        int cols = matrix[0].length;
        int cMid = cols/2;
        while(rStart< rEnd-1){
            int mid = rStart + (rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            else if(matrix[mid][cMid]>target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }
        if(matrix[rStart][cMid] == target){
            return new int[] {rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[] {rStart+1,cMid};
        }
        if(target<=matrix[rStart][cMid-1]){
            return bsearch(matrix,rStart,0,cMid-1,target);
        }
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return bsearch(matrix,rStart,cMid+1,cols-1,target);
        }
        if(target<=matrix[rStart+1][cMid-1]){
            return bsearch(matrix,rStart+1,0,cMid-1,target);
        }
        else{
            return bsearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}
