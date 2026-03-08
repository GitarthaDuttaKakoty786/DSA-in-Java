import java.util.*;

public class SwapUsingXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
           System.out.println("Enter the num2");
        int b = sc.nextInt();
       display(a,b);
}
static void display(int a , int b){
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("now num1 is "+ a);
        System.out.println("now num2 is "+b);
    }
}

