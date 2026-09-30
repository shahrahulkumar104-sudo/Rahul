package PROGRAM;

public class DownTriangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows for the triangle

        for (int i = rows; i >= 1; i--) {
            // print spaces first (for alignment)
            for (int s = 0; s < rows - i; s++) {
                System.out.print("  "); // two spaces
            }
            // then print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

