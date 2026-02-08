import java.util.*;

public class Pattern2UsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of Rows ");
        int n = sc.nextInt();
        int i=1;
        while (i<=n) {
            int j=n;
            while (j>=i) {
                System.out.print("*");
                j--;
            }
            System.out.println( );
            i++;

        }
    }
}
