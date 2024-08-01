package CondSec04;

public class Switch04 {

    public static void main(String[] args) {
        //앞으로는 이러한 switch문을 많이 쓸 것으로 예상.
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 받은 쿠폰은" + coupon);
    }
}
