import java.util.Scanner;
public class SumUsingFunctionsInt{
    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = add(x, y);
        System.out.println("Sum: " + z);
        sc.close();
    }
}