import java.util.*;

public class GCDmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b>0) {
            int rem = a%b;
            a=b;
            b =rem;

        }
        System.out.print(a);
    }
}
