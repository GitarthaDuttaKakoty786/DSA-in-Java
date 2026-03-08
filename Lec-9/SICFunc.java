import java.util.Scanner;
public class SICFunc {
    public static void SIC(int p, int r, int t){
        int s = (p*r*t)/100;
        System.out.println("Simple interest is: " + s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        SIC(P, R, T);
    }
}

