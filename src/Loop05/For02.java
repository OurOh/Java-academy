package Loop05;

public class For02 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);

        }
    }
}