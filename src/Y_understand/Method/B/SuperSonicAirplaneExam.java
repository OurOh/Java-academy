package Y_understand.Method.B;

public class SuperSonicAirplaneExam {

    public static void main(String[] args) {

        SuperSonicAirplane F22 = new SuperSonicAirplane(); // F22 객체 생성

        F22.takeOff();
        F22.fly();
        F22.flyMode = SuperSonicAirplane.SUPERSONIC; // 초음속 모드로 변경.
        F22.fly();      // 초음속 비행합니다.
        F22.flyMode = SuperSonicAirplane.NORMAL;
        F22.fly();      // 일반 비행합니다.
        F22.land();

    }
}
