package I_method09.ex;

public class MethodEx02Ref {
    public static void main(String[] args) {
        printMessage("Hello, world!" ,3);
        printMessage("Hello, world!" ,5);
        printMessage("Hello, world!" ,7);
    }

    // 메소드(함수) 생성.
    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}
