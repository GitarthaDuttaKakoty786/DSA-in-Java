import java.util.Scanner;
public class SumofNFunc{
    public static void Sum(int x){
        int sum = 0;
        for(int i = 1; i<=x; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n);
    }
}