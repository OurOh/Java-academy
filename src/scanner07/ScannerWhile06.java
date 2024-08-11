package scanner07;

import java.util.Scanner;

public class ScannerWhile06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요. 단, 0을 입력하면 종료합니다 : ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("입력한 모든 정수의 합 : " + sum);
    }
}
