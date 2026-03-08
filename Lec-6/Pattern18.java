import java.util.*;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();  // example: 5

        int num = 1; // start printing from 1
        for (int row = 1; row <= n; row++) {

            // print leading spaces for pyramid shape
            for (int s = row; s < n; s++) {
                System.out.print("   "); // adjust spacing as needed
            }

            // how many numbers per row: (2 * row - 1)
            int totalNums = 2 * row - 1;
            for (int col = 1; col <= totalNums; col++) {
                System.out.printf("%3d", num); // %3d gives aligned columns
                num++;
            }

            System.out.println(); // move to next line
        }
    }
}