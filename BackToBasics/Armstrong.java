package BackToBasics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        for (int i = 100; i <= 999; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int n){
        int sum = 0;
        int dup = n;
        while(dup>0){
            int rem = dup%10;
            sum = sum + (rem*rem*rem);
            dup = dup/10;
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
