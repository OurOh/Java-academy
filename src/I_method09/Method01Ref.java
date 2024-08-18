package I_method09;

public class Method01Ref {

    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력 : " + sum1);

        //계산2
        int sum2 = add(15, 10);
        System.out.println("결과 2 출력:" + " 연산 수행");
    }

    //add 메서드, add라는 함수를 만든것이다.
    public static int add (int a, int b){
        System.out.println(a + "+" + b + " 연산 수행을합니다.");
        int sum = a + b;
        return sum;
    }

}


