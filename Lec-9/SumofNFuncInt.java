import java.util.Scanner;
public class SumofNFuncInt{
    public static int Sum(int x){
        int sum = 0;
        for(int i = 1; i<=x; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = Sum(n);
        System.out.println("The sum is: " + s);
    }
}