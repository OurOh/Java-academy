package scanner07.Ex;

import java.util.Scanner;

public class ScannerEx04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요 : ");
        int number = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(number +  " X " + i + " = " + (number * i));
        }
    }
}
