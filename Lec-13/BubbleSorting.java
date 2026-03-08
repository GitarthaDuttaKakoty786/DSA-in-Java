import java.util.*;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Bubblesort(arr, n);
        display(arr, n);

    }


static void Bubblesort(int [] arr, int n ){
 for (int i = 0; i < n-1; i++) {
    for (int j = 0; j < n-i-1 ; j++) {
          if (arr[j]>arr[j+1]) {
         int temp = arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
    }
 }
}

static void display (int[] arr,int n){
    for (int i = 0; i < n; i++) {
        System.out.print( arr[i]+" ");
    }
}
  
    
}

