package Casting06;

public class Casting01 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long)intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = (double)intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = (double) 20L; // long => double
        System.out.println("doubleValue2 = " + doubleValue); //

        //형변환, 작은그릇에서 큰 그릇으로는 자동 형변환해준다.
        // 큰 그릇에서 작은그릇으로는 명시적 형변환을 해줘야한다.
    }
}
