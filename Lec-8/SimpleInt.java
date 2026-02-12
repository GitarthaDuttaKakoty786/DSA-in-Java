import java.util.*;


public class SimpleInt {
    public static int SimpleInterest(int p ,int r , int t ){
        int x = p*t*r/100;
        return x;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter p , t, r");
    int p = sc.nextInt();
    int t = sc.nextInt();
    int r = sc.nextInt();
    System.out.println(SimpleInterest(p, r, t));

  }
}