package H_array08;

public class ArrayRef01 {

    public static void main(String[] args) {

        int[] students; //배열 변수를  선언한다.
        students = new int[5]; //배열 생성 // 0~4, 5개짜리 배열을 만들었다는 뜻.
        //변수 값 대입하기
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        //변수 값 사용하기
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}

