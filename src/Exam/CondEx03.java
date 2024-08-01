package Exam;

public class CondEx03 {

    public static void main(String[] args) {

        int dollar = 10;

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다..");  // dollar = 0 , 이것이 아닌 dollar == 0 이렇게 해야 맞다.
        }else {
            int won = dollar * 1300;
            System.out.println("환전 금액은" + won + "원 입니다.");
        }
    }
}
