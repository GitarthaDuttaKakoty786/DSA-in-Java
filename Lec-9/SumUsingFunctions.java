import java.util.Scanner;
public class SumUsingFunctions{
    public static void add(int a, int b){
        int c = a + b;
        System.out.println("Sum: " + c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        add(x, y);
        sc.close();
    }
}