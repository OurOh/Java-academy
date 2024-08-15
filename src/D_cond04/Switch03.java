package D_cond04;

public class Switch03 {

    public static void main(String[] args) {

        int grade = 2;
        //break가 없다면?? 중단하지 않고 case3이 실행된다.
        int coupon;
        switch(grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:

            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰:" + coupon);
    }
}
