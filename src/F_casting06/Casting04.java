package F_casting06;

public class Casting04 {

    public static void main(String[] args) {
        int div1 = 3 / 2; // 원래 답은 1.5   // int와  int를 나누니까 정수로 나온다.
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // 1.0이 나온다. //  int가 나와야하는데 double로 자동형변환이 되므로 1.0이 나온다.
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 이거는 1.5가 나온다. // double 나누기 int이기에 double로 자동 형변환되어 값이 나온다.
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
