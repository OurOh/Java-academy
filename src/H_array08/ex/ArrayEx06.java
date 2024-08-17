package H_array08.ex;

import java.util.Scanner;

public class ArrayEx06 {
    public static void main(String[] args) {
        //복잡하니 잘 체크할 것.
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber;
        int maxNumber;

        System.out.println(n + " 개의 정수를 입력하세요 : ");
        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];  // 여러번 볼 것.
        for (int i = 1; i < n; i++) {
            if(numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수 : " + minNumber);
        System.out.println("가장 큰 정수 : " + maxNumber);


    }
}

