package BackToBasics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int next = a+b;
            a = b;
            b = next;
            count+=1;
        }
        System.out.println(b);
    }
}
