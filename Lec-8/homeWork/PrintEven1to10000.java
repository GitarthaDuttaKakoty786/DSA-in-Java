
import java.util.*;
public class PrintEven1to10000 {
    public static void Print(int n ){
         for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 10000;
        Print(n);
       
    }
}
