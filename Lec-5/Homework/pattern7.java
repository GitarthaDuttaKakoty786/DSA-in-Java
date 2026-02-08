import java.util.*;

public class pattern7 {
    public static void main(String[] args) { // <--- 1. Must be inside main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // <--- 2. Move println here to break the line after each row
            System.out.println(); 
        }
    }
}
