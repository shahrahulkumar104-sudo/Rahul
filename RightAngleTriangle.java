package PROGRAM;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // move to the next line after each row
            System.out.println();
        }
    }
}
