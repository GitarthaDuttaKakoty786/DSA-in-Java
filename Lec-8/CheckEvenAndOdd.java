import java.util.*;

public class CheckEvenAndOdd {

    public static void check(int a ){
        if (a%2==0) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        check(a);

    }
}
