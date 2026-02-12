
public class SumOfEvenNo {
    public static int SUM(int sum ){
         for (int i = 2; i <= 10000; i += 2) {
            sum += i;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = 0;
       
        System.out.println(SUM(sum));
    }
}

