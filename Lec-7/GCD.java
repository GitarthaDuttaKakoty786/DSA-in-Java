import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a%b!=0) {
            int rem = a%b;
            a = b;
            b = rem;

        }
       System.out.print(b);
}
}