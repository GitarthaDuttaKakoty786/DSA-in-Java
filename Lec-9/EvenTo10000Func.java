public class EvenTo10000Func{
    public static void even(int i){
        for(i = 1; i<=10000; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        int x=1;
        even(x);
    }
}