import java.util.Scanner;
public class ReverseFuncInt{
    public static int Rev(int x){
        int reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int n = sc.nextInt();
        int rev = Rev(n);
        System.out.println("The reversed number is: " + rev);
        sc.close();

    }
}