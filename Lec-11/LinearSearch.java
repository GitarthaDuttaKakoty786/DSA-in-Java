
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
         System.out.println("Enter the required number");
        int num=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        display(arr, num);
         
    
    }
    static void display(int[]arr,int num){
    for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
            System.out.print(arr[i]+ " ");
            break;
            }
    }

    }

}

