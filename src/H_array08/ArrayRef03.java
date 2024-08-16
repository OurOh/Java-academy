package H_array08;

public class ArrayRef03 {

    public static void main(String[] args) {
        // 배열생성을 간력하게한 버전이다. 배열 선언과 함께 사용시 new int[] 생략 가능하다.
        int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화.

        //변수 값 사용하기
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수 : " + students[i]); // 괄호() 빼먹지 않기
        }

    }
}

