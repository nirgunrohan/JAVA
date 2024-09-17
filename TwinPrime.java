// WAP to find the pair of twin prime number between the specific range.
import java.util.Scanner;
public class TwinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit of range: ");
        int upper = sc.nextInt();

        System.out.println("Twin prime numbers between "+ lower + " and "+ upper + " : ");
        findTwinPrime(lower,upper);
       
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
    private static void findTwinPrime(int lower,int upper) {
        for (int i = lower; i <= (upper-2); i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("("+ i + "," + (i + 2) + ")");
            }
        }
    }
    
}
