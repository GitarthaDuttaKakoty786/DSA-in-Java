

public class sumOfEven1to10000 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10000; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 10000: " + sum);
    }
}
