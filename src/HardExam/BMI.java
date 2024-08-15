package HardExam;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner 객체를 생성한다.
        // 사용자의 이름을 받자
        System.out.print("이름을 입력하세요 (0이상 입력하세요) :");
        String name = scanner.nextLine();
        //1.나이를 받기
        int age;
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = scanner.nextInt();

            if (age > 0) {
                break;
            } else {
                System.out.println("유효하지 않은 나이입니다. 다시 입력해주세요.");
            }
        }
        //2. 키 입력받기
        double heightInCm;
        while (true) {
            System.out.print("키를 입력하세요. (cm, 0 이상) : ");
            heightInCm = scanner.nextDouble();

            if (heightInCm > 0) {
                break;
            } else {
                System.out.print("키를 입력하세요(cm, 0이상) : ");  // {,} 헷갈리지 않게 주의하기.
            }
        }
        //3. 체중 입력받기
        double weightInKg;
        while (true) {
            System.out.print("체중을 입력하세요. (kg, 0이상) : ");
            weightInKg = scanner.nextDouble();

            if (weightInKg > 0) {
                break;
            } else {
                System.out.print("체중을 입력하세요.(kg, 0 이상) :");
            }
        }
        //4. 위의 내용들을 종합하여 BMI를 구해보자. BMI = 몸무게(kg) / 키(m) X 키(m).
        double heightInMeters = heightInCm / 100; //그 전에 cm로 받은 키를 m로 바꾸자.

        double BMI = weightInKg / (heightInMeters * heightInMeters);
        //5. 결과를 출력하자.
        System.out.println("\n----결과----");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.printf("BMI: %.2f\n", BMI);
        //5. BMI에 따른 건강상태 출력
        if (BMI < 18.5) {
            System.out.println("저체중입니다.");
        } else if ( 18.5 <= BMI && BMI < 25.0) {
            System.out.println("정상체중입니다.");
        } else if (25.0 <= BMI && BMI < 30.0) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }
        scanner.close();               //마지막으로 스캐너 해제
    }
}
