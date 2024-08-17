package H_array08.ex;

import java.util.Scanner;

public class ArrayEx04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("정수 5개를 입력하시오 : ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double)sum / numbers.length;

        System.out.println("입력한 정수의 합계 :" + sum);
        System.out.println("입력한 정수의 평균 :" + average);


    }
}
