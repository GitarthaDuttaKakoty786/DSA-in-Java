public class SumofEvenTo10000Func{
    public static void sum(int i){
        int sum = 0;
        for(i = 1; i<=10000; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int s = 0;
        sum(s);
    }
}