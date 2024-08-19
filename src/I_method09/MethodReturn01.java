package I_method09;

public class MethodReturn01 {

    public static void main(String[] args) {
        //반환 타입이 있는 경우.
        boolean result = odd(3);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
