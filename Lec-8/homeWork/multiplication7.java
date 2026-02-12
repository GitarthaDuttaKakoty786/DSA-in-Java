
public class multiplication7 {
    public static void multiplication(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        int number = 7;
        multiplication(number);
    }
}
