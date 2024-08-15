package G_scanner07.Ex;

import java.util.Scanner;

public class ScannerWhileEx08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
        System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료) : ");
        int price = input.nextInt();

        if (price == -1) {
            System.out.println("프로그램을 종료합니다.");
            break;
        }

        System.out.print("구매하려는 수량을 입력하세요 : ");
        int quantity = input.nextInt();

        int totalCost = price * quantity;
        System.out.println("총 비용 : " + totalCost);   //밖으로 말고 안에서 돌리기.

        }

    }
}
