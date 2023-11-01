package linearSearch;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] n = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(n)));
        // System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
        // plusOne(new int[] {1,2,3});
    }
    static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i++){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [digits.length+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
}
