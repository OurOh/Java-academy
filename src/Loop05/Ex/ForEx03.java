package Loop05.Ex;

public class ForEx03 {

    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

// 0 = 0 +1
// 1 = 1 + 2
// 3 = 3 + 3
// 6 = 6 + 4
// sum = sum + 100