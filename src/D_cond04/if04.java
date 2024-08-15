package D_cond04;

public class if04 {

    public static void main(String[] args) {
        //둘은 다른 조건이다.
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매 시, 1000원 할인");
        }

        if (age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액:" + discount + "원");
    }
}
