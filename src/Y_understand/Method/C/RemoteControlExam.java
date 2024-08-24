package Y_understand.Method.C;

public class RemoteControlExam {

    public static void main(String[] args) {

        System.out.println("리모콘의 최대 볼륨은" + RemoteControl.Max_Volume);
        System.out.println("리모콘의 최대 볼륨은" + RemoteControl.Min_Volume );
        System.out.println();

        RemoteControl rc = new Televison();         // rc 객체 생성. 이를 이용하여
        // RemoteControl 인터페이스의 메소드를 호출
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
    }
}
