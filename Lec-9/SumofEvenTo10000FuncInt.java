public class SumofEvenTo10000FuncInt{
    public static int sum(int i){
        if(i%2==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i<=10000; i++){
            int x = sum(i);
            if(x==1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}