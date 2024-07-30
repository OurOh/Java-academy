package Operator03;

public class Logicl01 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산");  //교집합
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("|| : OR 연산"); //합집합
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); //교집합
        System.out.println(a || b); //합집합
        System.out.println(!a);
        System.out.println(!b);
    }
}
