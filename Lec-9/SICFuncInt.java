import java.util.Scanner;
public class SICFuncInt {
    public static int SIC(int p, int r, int t){
        int s = (p*r*t)/100;
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        int sic = SIC(P, R, T);
        System.out.println("Simple interest is: " + sic);
    }
}

