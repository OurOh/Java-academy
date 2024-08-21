package I_method09.casting;

public class MethodCasting01 {

    public static void main(String[] args) {
        double  number = 1.5;
        //printNumber(number);  // double을 int에 대입하므로 컴파일 오류. 큰그릇을 작은그릇에 담으니 오류.
        printNumber((int) number);

    }

    //메소드 만들기
    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
