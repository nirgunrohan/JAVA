// WAP to check whether given number belongs to Fibonacci series or not.
// WAP to print fibonacci series upto input range.
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether it belongs to fibonacci series: ");
        int n = sc.nextInt();
        if (isFibo(n)) {
            System.out.println(n + " belongs to fibonacci series");
        }
        else {
            System.out.println(n + " does not belong to fibonacci series");
        }

        System.out.print("Enter range to print fibonacci series upto: ");
        int num = sc.nextInt();
        printFibo(num);

    }
    private static boolean isFibo(int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
            if (b == n) {
                return true;
            }
        }
        return false;
    }

    private static void printFibo(int num) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series upto " + num + " is:");
        while (a <= num) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
