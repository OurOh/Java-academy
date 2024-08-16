package H_array08;

public class ArrayRef02 {

    public static void main(String[] args) {

        int[] students; // 배열 변수 선언.
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성 // 0~4, 5개짜리 배열을 만들었다는 뜻.


        //변수 값 사용하기
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수 : " + students[i]); // 괄호() 빼먹지 않기
        }

    }
}

