package F_scope06;

public class Scope01 { //범위

    public static void main(String[] args) {
        int m = 10; // m  생존시작
        if (true) {
            int x = 20; //x 생존시작
            System.out.println("if m =" + m);
            System.out.println("if x =" + x);
        } //x 종료
        System.out.println("main x =" + m);
    } // m 종료
}
