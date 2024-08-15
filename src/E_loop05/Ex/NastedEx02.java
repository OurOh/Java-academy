package E_loop05.Ex;

public class NastedEx02 {

    public static void main(String[] args) {
        int rows = 10; //행 (가로)

        for(int i = 1; i <= rows; i ++){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



/*
        System.out.print("*");
        System.out.println();

        System.out.println("*");
        System.out.println("*");
        System.out.println();

 */
    }
}
