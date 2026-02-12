import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.. of rows ");
        int n = sc.nextInt();
        int space=n-1;
        int star= 1;
        int row =1;
        while (row<=2*n-1) {
            int i =1;
            while (i<=space) {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while (j<=star) {
                System.out.print("*");
                j++;
                
            }
            if (row<n) {
                star++;
                space--;
                
            }
            else{
                star--;
                space++;
            }

             
            System.out.println( );
             
            row++;
        }
    }
}
