import java.util.Scanner;
public class TableOf7Func{
    public static void Table(int x){
        for(int i=1; i<=x; i++){
            int result = 7*i;
            System.out.println("7 x " + i + " = " + result);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number needed in table: ");
        int N = sc.nextInt();
        Table(N);
    }
}