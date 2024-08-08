package Casting06;

public class Casting04 {

    public static void main(String[] args) {
        int div1 = 3 / 2; // 원래 답은 1.5
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // 1.0이 나온다.
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 이거는 1.5가 나온다.
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);
    }
}
