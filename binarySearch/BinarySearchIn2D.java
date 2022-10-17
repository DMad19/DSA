package binarySearch;

import java.util.Arrays;

class BinarySearchin2D{
    public static void main(String[] args) {
        int[][] a= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(a, 5)));
    }
    static int[] search(int[][] matrix,int target){
        int r = 0;
        int c = matrix[matrix.length-1].length-1;
        while(r<=matrix.length-1 && c>=0){
            if(matrix[r][c] == target ){
                return new int[] {r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}