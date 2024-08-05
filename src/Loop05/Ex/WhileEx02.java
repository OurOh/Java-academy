package Loop05.Ex;

public class WhileEx02 {

    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2; //짝수값을 위해 2를 더해준다.
            count++;
        }
    }
}
