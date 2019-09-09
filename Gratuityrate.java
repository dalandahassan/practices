import java.util.*;
class Login
{
	public static void main(String [] a)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Subtotal and Gratuity rate: ");
		double subtotal = sc.nextDouble();
		double gratuity = sc.nextDouble();
		double gratuity_rate;
		gratuity_rate = (gratuity / 100) * subtotal; 
		System.out.println("The Gratuity is $"+gratuity_rate+" and total is $"+(subtotal+gratuity_rate));
		
	}//main
}