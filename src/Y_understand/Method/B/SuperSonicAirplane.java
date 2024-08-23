package Y_understand.Method.B;

public class SuperSonicAirplane extends Airplane{
    //상수
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    //상태 필드
    public int flyMode = NORMAL;

    //메소드 재정의
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }else {                                     //부모 객체의 fly 메소드를 호출
            super.fly();                            //super는 부모클래스에 접근하는 예약어이다.
        }
    }
}
