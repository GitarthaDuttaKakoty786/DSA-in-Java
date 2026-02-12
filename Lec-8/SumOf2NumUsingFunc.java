import java.util.*;

public class SumOf2NumUsingFunc {
     public static int add(int a , int b){
            int c = a+b;
            return c;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int x = add(a,b);
        
        System.out.println(x);
       

    }
}
