package I_method09;

public class Method01 {

    public static void main(String[] args) {
        //메소드(함수)가 필요한 이유 다음 코드는 비효율적이다.
        //계산1
        int a = 1;
        int b = 2;
        System.out.println(a + "+" + b + " 연산 수행");
        int sum1 = a + b;
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("=================================");

        //계산2
        int x = 10;
        int y = 20;
        System.out.println( x + " + " + y + " 연산 수행");
        int sum2 = x + y;
        System.out.println("결과2 출력:" + sum2);

    }
}
