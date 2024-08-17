package H_array08.ex;

import java.util.Scanner;

public class ArrayEx03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        //입력받기
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        //출력하기을 거꾸로하기.
        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {      // ++만 있는것이 아닌 --도 있다는 것을 명심하자.
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }


    }
}
