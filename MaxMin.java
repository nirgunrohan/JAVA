// WAP to accept 3 nos. From command line arguments and print maximum, minimum and total of all three nos. 
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int total = a + b + c;
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        System.out.println("Total of all three numbers is: "+total);
         
    }
   
}
