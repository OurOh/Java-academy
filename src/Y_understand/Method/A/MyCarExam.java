package Y_understand.Method.A;

public class MyCarExam {

    public static void main(String[] args) {

        Car superCar = new SuperCar(); //superCar 객체 생성
        Car thumpTruck = new ThumpTruck(); // thumpTruck 객체 생성

        System.out.println(superCar.cracktion());
        System.out.println(thumpTruck.cracktion());
    }
}
