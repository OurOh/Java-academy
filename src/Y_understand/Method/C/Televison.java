package Y_understand.Method.C;

public class Televison implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.Max_Volume) {
            this.volume = +RemoteControl.Max_Volume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV의 볼륨은 + " + this.volume + "입니다.");

    }




}