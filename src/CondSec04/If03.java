package CondSec04;

public class If03 {

    public static void main(String[] args) {

        int age = 35;

        if(age <= 7){
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age < 19) {
            System.out.println("고등학생입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
