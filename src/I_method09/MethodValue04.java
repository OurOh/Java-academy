package I_method09;

public class MethodValue04 {

    public static void main(String[] args) {
        // 대원칙 아주 중요.
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); // 5

        num1 = changeNumber(num1);
        System.out.println("2. changeNumber 호출 후, num1: " + num1); // 10
    }


    //메소드(함수) 만들기
    public static int changeNumber(int num2) {
        num2 = num2 * 2;
        return num2;
    }
}
