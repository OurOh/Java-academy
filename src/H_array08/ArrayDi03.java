package H_array08;

public class ArrayDi03 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        for (int row = 0; row < arr.length; row ++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); //0열 출력
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }

    }
}
