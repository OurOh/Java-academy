package C_operator03;

public class OperatorEx01 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        //int는 정수니까 소수점 나머지는 버려진다.
        int sum = num1 + num2 + num3;
        int average = (num1 + num2 + num3) / 3;

        System.out.println(sum); //60
        System.out.println(average); //20
    }
}
