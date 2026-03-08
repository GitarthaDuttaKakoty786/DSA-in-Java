import java.util.Scanner;
public class EvenOddFuncInt{
    public static int check(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = check(x);
        if(y == 1){
            System.out.println(x + " is even");
        }
        else{
            System.out.println(x + " is odd");
        }
    }
}
