
import java.util.*;

public class LottaryAdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n>300 && n<=460) {
            System.out.println("The prize is macbook");
             if (n>=300 && n<=380) {
                System.out.println("Prize is Model 1 ");
             }
             else{
                System.out.println("prize is model 2");
             }

        } else if (n>=200 && n<=280) {
            System.out.println("The prize is Kurkure");
            if (n>=200 && n<=240) {
                System.out.println("Flavor Chilli Kurkure");
            }
            else{
                System.out.println("Flavor Onion kurkure");
            }
        }
        else if (n>=1100 && n<=1500) {
            System.out.println("the prize is cycle");
            if (n>=1100 && n<=1300) {
                System.out.println("Avon cycle");
            }
            else{
                System.out.println("Hero cycle");
            }
        }
         else if (n>50 && n <=80) {
            System.out.println("the prize is bike");
            if (n>50 && n<=65) {
                System.out.println("Bullet");
            }
            else{
                System.out.println("Rajdoot");
            }
        } 
         else{
            System.out.println("better luck next time");
         }

    }
}
