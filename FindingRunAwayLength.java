/**
 * 2.12 programming Exercise Daniel Liang
 **/
import java.util.Scanner;
public class FindingRunAwayLength 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double length = Math.pow(v, 2)/(2*a);
         System.out.printf("The minimum runway length for this airplane is %.3f" , length);
         System.out.println();
    }
    
}
