// Program to illustrate Operators.
public class Operators {
    public static void main(String[] args) {
        int a = 12, b = 5, d = 1010, e = 1100;

        // Arithmetic Operators
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));

        // Modulo operator
        System.out.println("a % b = "+ (a%b));

        // Assignment operator
        int var;
        var = 10;
        System.out.println("Value of var = "+ var);

        // Relational Operator
        System.out.println("a > b = "+ (a>b));
        System.out.println("a < b = "+ (a<b));
        System.out.println("a == b : "+ (a==b));
        System.out.println("a != b : "+ (a!=b));
        System.out.println("a >= b : "+ (a >= b));  
	    System.out.println("a <= b : "+ (a <= b)); 

        // Logical operator
        System.out.println("a > b && a < b : "+ ((a > b) && (a < b)));
        System.out.println("a > b || a < b : "+ ((a > b) || (a < b)));

        // Increment operator
        System.out.println("Value of a before increment : "+ a);
        a++;
        System.out.println("Value of a after increment : "+ a);

        // Decrement operator
        System.out.println("Value of a before decrement : "+ a);
        a--;
        System.out.println("Value of a after decrement : "+ a);

        // Boolean operator
        System.out.println("d & e: "+ (d&e));
        System.out.println("d | e: "+ (d|e));
        System.out.println("d ^ e: "+ (d^e));
        System.out.println("~d : "+ (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 1: " + (e >>> 1));

        // Conditional / ternary operator
        int februaryDays = 29;
        String result;
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

    }
}
