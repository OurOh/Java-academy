package scanner07.Ex;

import java.util.Scanner;

public class ScannerEx02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();


        if (num1 % 2 == 0) {
            System.out.println(num1 + " 정수는 짝수입니다.");   // ; 주의해서 사용하기.
        } else {
            System.out.println(num1 + " 정수는 홀수입니다.");
        }
    }
}
