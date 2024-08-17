package H_array08.ex;

public class ArrayEx01 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = 0;
        for (int i = 0; i < students.length; i++) {    //ALT + ENTER 눌러보자. 더 좋은 코드로 바꿔준다.
            total += students[i];
        }
        double average = (double) total / 5;
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);

    }
}