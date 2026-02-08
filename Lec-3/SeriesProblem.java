import java.util.*;

public class seriesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
          System.out.println("enter the difference");
          int d = sc.nextInt();
              System.out.println("enter limit");
          int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            int term = a+(i*d);
            System.out.println(term);

        }
    }
}



