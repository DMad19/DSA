package BackToBasics;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            int c = 2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c+=1;
            }
            if(c*c>n){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
