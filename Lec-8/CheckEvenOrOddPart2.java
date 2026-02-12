import java.util.*;

public class CheckEvenOrOddPart2 {

    public static string Check(int a){
        if(a%2==0){
            string b = "Even";
            return b;
        }
        else{
            string c = "odd";
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int a = sc.nextInt();
         x = check(a);
    }
}
