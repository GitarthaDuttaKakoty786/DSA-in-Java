import java.util.*;

public class MaxOf3Num {
    public static int Max(int a , int b , int c){
        if (a>b && a>c) {
            return a;
        }
        else if (b>c && b>a) {
            return b;

        }
        else{
            return c;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
            
        int x = Max(a,b,c);
        System.out.println("Biggest number of the three is :"+x);
        


    }
}
