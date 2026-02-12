import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows");
    int n = sc.nextInt();
    int star = 1;
    int rows = 1;
    while (rows<=2*n-1) {
        int i = 1;
        while (i<=star) {
            System.out.print("*");
            i++;
        }
        if (rows<n) {
            star++;
        }
        else{
            star--;
        }

         System.out.println( );
        rows ++;
    }
    }
    
}
