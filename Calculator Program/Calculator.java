/* Java Calculator program */
import java.util.Scanner;
public class SquareRoot
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + squareRoot);
        
        input.close();
}
}
