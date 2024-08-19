package I_method09;

public class MethodReturn02 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);

    }

    public static void checkAge(int age){
        if (age < 18) {
            System.out.println(age  + "살, 미성년자는 출입이 불가합니다.");
            return;    // ruturn을 만나면 내려가지않고 메서드를 빠져나간다.
        }
        System.out.println(age + "살, 입장하세요.");
    }
}
