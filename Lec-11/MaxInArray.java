import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int max = 0;
        System.out.println("Enter the elements");
        int [] arr=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        display(arr, max);
         
    
    }
    static void display(int[]arr,int max){
    for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max = arr[i];
              }
            
    }
     System.out.print(max+ " ");

    }

}


