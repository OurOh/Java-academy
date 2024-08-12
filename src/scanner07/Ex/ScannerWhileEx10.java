package scanner07.Ex;

import java.util.Scanner;

public class ScannerWhileEx10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1: 상품입력 2: 결제 3: 프로그램 종료");
        String name = scanner.nextLine();

        System.out.print("상품의 가격을 입력하세요 : ");
        int price = scanner.nextInt();

        System.out.print("구매 수량을 입력하세요 : ");
        int quantity = scanner.nextInt();



    }
}
