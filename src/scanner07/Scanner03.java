package scanner07;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  /// System.in 넣어주기 까먹지 말자.

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두번째 정수를 입력하세요 ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 수는" + num1 + "입니다.");
        } else if (num2 > num1) {
            System.out.println("더 큰 수는" + num2 + "입니다.");
        } else {
            System.out.println("두 수는 같습니다.");
        }


    }
}
