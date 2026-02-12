import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int prime = 1;
        int n = sc.nextInt();
        for (int i = 2; i<=n-1; i++) {
            if (n%i==0) {
                prime = 0;  
                break; 
            }
            
        }
        
        if (prime==1) {
            System.out.println("The numnber is Prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}
