package F_casting06;

public class Casting03 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 //int 최고값 + 1(초과) int의 범의를 넘어서기 때문에 마지막에 L 을 붙여서 long형을 사용해야한다.
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting =" + intValue);  //- 가 붙는다. 담을수있는 제일 처음으로 돌아간다. 오버플로우 발생이라한다.

        //변수 intValue의 타입을 long으로 변경하면 문제가 해결된다.


    }
}
