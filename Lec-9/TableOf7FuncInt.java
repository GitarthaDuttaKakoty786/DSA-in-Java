import java.util.Scanner;
public class TableOf7FuncInt{
    public static int Table(int x){
        int result = 0;
        for(int i=1; i<=x; i++){
            result = 7*i;
            return result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number needed in table: ");
        int N = sc.nextInt();
        int r = Table(N);
        System.out.println(r);
    }
}