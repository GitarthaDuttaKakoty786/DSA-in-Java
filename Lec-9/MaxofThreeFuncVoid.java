import java.util.Scanner;
public class MaxofThreeFuncVoid{
    public static void max(int x, int y, int z){
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>x && y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
    }
}