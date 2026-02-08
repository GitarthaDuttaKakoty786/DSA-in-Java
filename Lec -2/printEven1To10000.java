
import java.util.*;
public class printEven1To10000 {
    public static void main(String[] args) {
        int n = 10000;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
