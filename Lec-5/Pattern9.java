import java.util.*;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n = sc.nextInt();
        int space=0;
        int star = 2*(n) -1;
        int row= 1;
        while (row<=n) {
            int i = 1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("*");
                j++;
            }
            System.out.println( );
            space++;
            star=star-2;
            row++;
        }
    }
}

