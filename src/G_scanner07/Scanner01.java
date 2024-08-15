package G_scanner07;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: "); //println이면 문자가 밑으로 내려간다. 그렇기에 print이다.
        String str = scanner.nextLine();  // 입력을 String으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수:" + intValue);

        System.out.println("실수로 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue); //객체와 클래스를 제대로 배워야 이해가 된다.
    }
}
