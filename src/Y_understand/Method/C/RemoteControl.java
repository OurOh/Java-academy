package Y_understand.Method.C;

public interface RemoteControl {
    //필드선언, 상수값(편하지 않는 값) 설정.
    int Max_Volume = 10;
    int Min_Volume = 0;
    //추상 메소드
    public void turnOn();
    public void turnOff();
    void setVolume(int volume); // setVolume 볼륨을 설정하는 메소드.

    default void setMute(boolean mute){     // setmute라는 디폴트 메서드 생성.
        if (mute) {
            System.out.println("무음처리합니다.");
            setVolume(Min_Volume);
        } else {
            System.out.println("무음해제합니다.");
        }
    }
}
