package F_scope06;

public class Scope03_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;   //템프를 깔끔하게 if 안으로 들여왔다.
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
