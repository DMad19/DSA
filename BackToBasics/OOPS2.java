package BackToBasics;

public class OOPS2 {
    static class B{
        int a;
        B(int a){
            this.a = a;
        }
    }
    public static void main(String[] args) {
        B obj1 = new B(12);
        B obj2 = new B(13);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
