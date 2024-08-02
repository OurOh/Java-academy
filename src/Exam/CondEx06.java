package Exam;

public class CondEx06 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = (a > b)? a : b;  // 삼항 연산자 참이면 a를 거짓이면 b를
        System.out.println("더 큰 숫자는" + max + "입니다.");
    }
}
