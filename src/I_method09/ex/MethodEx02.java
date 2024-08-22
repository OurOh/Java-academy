package I_method09.ex;

public class MethodEx02 {
    public static void main(String[] args) {
        String message = "Hello, world";

        for (int i = 0; i < 3; i++) {    //3
            System.out.println(message);
        }

        for (int i = 0; i < 5; i++) {    //5
            System.out.println(message);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(message); //7 총 15번.
        }

    }
}
