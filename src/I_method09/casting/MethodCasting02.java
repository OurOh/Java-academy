package I_method09.casting;

public class MethodCasting02 {

    public static void main(String[] args) {
        int number = 100;
        printNumber(number);
    }

    //메소드 만들기 . 작은그릇을 큰 그릇에 담으니 오류없이 잘된다.
    public static void printNumber(double n){
        System.out.println("숫자 : " + n);

    }

}
