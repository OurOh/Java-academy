package I_method09;

public class MethodValue03 {

    public static void main(String[] args) {
        // 대원칙 아주 중요.
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); // 5

        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5
    }


    //메소드(함수) 만들기
    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, number: " + number); // 5
        number = number * 2;
        System.out.println("3. changeNumber 변경 후. number: " + number); // 10
    }
}
