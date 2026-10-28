package program;

public class asdfasdf2 {

    public static void main(String... args) {

        System.out.println("start");

        int[] ab = {10, 20, 30, 40};

        try {
            int a = 100 / 0;

            System.out.println(ab[0]);
            System.out.println(ab[1]);
            System.out.println(ab[2]);
            System.out.println(ab[3]);

        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("end");
    }
}