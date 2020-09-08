import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if((a<b && b<c) || (c<b && b<a)){
            return b;
        }    
        else if((b<a && a<c) || (c<a && a<b)){
            return a;
        }
        else{
            return c; 
        }   

    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) < Math.abs(b)){
            return b;
        }
        else{
            return a;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double z = Math.pow(a,2) + Math.pow(b,2);
        return Math.sqrt(z);
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        //System.out.println(median(1, 2, 3)); // should be 2 checked
        //System.out.println(magnitude(-7, -1)); // should be -7 checked
        //System.out.println(pythagoras(3, 4)); // should be 5.0 checked

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String commandname = scan.next();

        if (commandname.equals("median")){
            System.out.println("What is the first number?");
            int medianone = scan.nextInt();
            System.out.println("What is the second number?");
            int mediantwo = scan.nextInt();
            System.out.println("What is the third number?");
            int medianthree = scan.nextInt();

            System.out.println("The median is " + median(medianone, mediantwo, medianthree));
        }
        else if (commandname.equals("magnitude")){
            System.out.println("What is the first number?");
            int magnitudeone = scan.nextInt();
            System.out.println("What is the second number?");
            int magnitudetwo = scan.nextInt();

            System.out.println("The magnitude is " + magnitude(magnitudeone, magnitudetwo));
        }
        else if (commandname.equals("pythagoras")){
            System.out.println("What is the first number?");
            int pythagone = scan.nextInt();
            System.out.println("What is the second number?");
            int pythagtwo = scan.nextInt();

            System.out.println("The hypotenuse is " + pythagoras(pythagone, pythagtwo));
        }
        else{
            System.out.println("That command name isn't valid.");
        }

    }
}
