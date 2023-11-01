package BackToBasics;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==num){
                count+=1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
