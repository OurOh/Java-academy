package I_method09.ex;

public class MethodEx01Ref {
    public static void main(String[] args) {
        //앞의 문제를 메소드를 이용하여 풀어보자.
        System.out.println("평균값 : " + average(1,2,3));
        System.out.println("평균값 : " + average(15,25,35));
    }
    //
    public static double average(int a, int b, int c){
        int sum = a + b + c;
        return sum / 3.0;
    }
}
