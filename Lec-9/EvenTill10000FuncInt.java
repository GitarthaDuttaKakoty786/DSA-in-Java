public class EvenTill10000FuncInt{
    public static int even(int i){
        if(i%2==0) return 1;
        else return 0;
}
    public static void main(String[] args){


        for(int i =1; i<=10000; i++){
            int x = even(i);

            if(x==1){
                System.out.println(i);
            }
        }
    }
}
