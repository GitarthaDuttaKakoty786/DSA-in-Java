import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("enter a number:");
        int a = sc.nextInt();
    
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a>c ) {
            System.out.println("a is bigger");
            
        }else if(b>a && b>c) {
         System.out.println("b is bigger");
        }
        else{
            System.out.println("c is bigger");
        }
    }
}