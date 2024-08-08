package Casting06;

public class Casting02 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //오류발생
        intValue = (int) doubleValue; // 형변환 큰통을 작은통에 못 넣는다. 그렇기에 형변환.
        System.out.println(intValue); //1이 나온다. 왜냐하면 1.5인 실수값이 정수로 나오기 때문이다.

        //형 변환을 영어로 casting 이라 한다.
        System.out.println(10.5);
        System.out.println( (int) 10.5);

    }
}
