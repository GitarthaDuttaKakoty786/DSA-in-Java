
import java.util.*;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        RightShift(arr, n);
        display(arr, n);
    }

    // Function to perform one left shift
    static void RightShift(int[] arr, int n) {
        int last = arr[n-1];
        for (int i = n-1 ; i >0  ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; // put first element at the end
    }

    // Function to display array
    static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
