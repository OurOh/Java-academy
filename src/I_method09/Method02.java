package I_method09;

public class Method02 {
    //매개변수 x, 반환타입 x
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }


    // 메서드, 모든 메서드는 항상 return을 호출해야한다. 하지만 반환타입 void는 생략해도 된다.
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");

    }

}
