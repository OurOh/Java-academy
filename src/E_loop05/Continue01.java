package E_loop05;

public class Continue01 {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;  // i가 3일때 if 문에 만족하니 +1을 해주고 sout을 무시하고 컨티뉴를 한다.
            }
            System.out.println(i);
            i++;
        }
    }
}
