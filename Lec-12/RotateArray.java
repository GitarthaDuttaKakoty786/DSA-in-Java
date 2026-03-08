import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rightShift(arr, n, k);
        display(arr, n);
    }

    static void rightShift(int[] arr, int n, int k) {
        if (n == 0) return;
        k = k % n; // Handle cases where k > n
        if (k == 0) return;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Helper function to reverse a part of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void display(int[] arr, int n) {
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
