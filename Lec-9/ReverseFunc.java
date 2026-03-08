import java.util.Scanner;
public class ReverseFunc{
    public static void Rev(int x){
        int reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int n = sc.nextInt();
        Rev(n);
        sc.close();

    }
}