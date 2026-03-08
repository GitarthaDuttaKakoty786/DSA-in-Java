import java.util.*;

public class Prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of Rows ");
        int n = sc.nextInt();

        int row = 1;
        int a = 0;
        int b = 1;

        while (row <= n) {

            int col = 1;

            while (col <= row) {

                System.out.print(a + " ");

                int c = a + b;
                a = b;
                b = c;

                col++;
            }

            System.out.println();
            row++;
        }
    }
}