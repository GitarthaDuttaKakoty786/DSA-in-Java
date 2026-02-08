import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int n = sc.nextInt();
        int space= 0 ;
        int star = n;
        int row = 1;
        while (row<=n) {
            int i=1;
            while (i<=star) {
                System.out.print("*");
                i++;
            }
            int j=1;
            while (j<space) {
                System.out.print(" ");
                j++;
            }
          if (row == 1) {
             star--;   // shrink only for row 1
                }
            int k=1;
            while (k<=star) {
                System.out.print("*");
                k++;
            }
            if (row == 1) {
                star++;   // restore for next iteration
                }

            System.out.println();
            space+=2;
            star--;
            row++;
        }
    }
}
