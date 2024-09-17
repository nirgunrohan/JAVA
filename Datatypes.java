// Program to illustrate datatypes.
public class Datatype {
    public static void main(String[] args) {
        boolean var1 = true;
        if (var1 == true){
            System.out.println("This is a boolean variable");
        }
        else{
            System.out.println("This is not a boolean variable");
        }
        char var2 = 'A';
        int a = 100;
        float b = 100.5f;
        double c = 100.54d;
        short d = 29;
        byte e = 67;
        long f = 2345671;
        String g = "Java is OOP language.";

        System.out.println("The character variable is " +var2);
	    System.out.println("The integer variable is " + a );
	    System.out.println("The short variable is " + d );
	    System.out.println("The byte variable is " + e );
        System.out.println("The float variable is " + b );
        System.out.println("The double variable is " + c );
        System.out.println("The long variable is " + f );
        System.out.println(g);

    }
}
