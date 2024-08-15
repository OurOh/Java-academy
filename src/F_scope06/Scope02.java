package F_scope06;

public class Scope02 {

    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m =" + m);
            System.out.println("for m =" + i);
        } //i 생존 종료

       // System.out.println("main i = " + i); i는 접근이 불가하다.
        System.out.println("main i = " + m);
    }
}
