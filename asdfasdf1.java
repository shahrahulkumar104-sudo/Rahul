package program;

public class asdfasdf {

    public static void main(String... args) {

        System.out.println("start");

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("end");
    }
}
