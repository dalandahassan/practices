
import java.util.*;
class GuessingGame
{
	public static void main (String[]args)
	{
		char ans;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			try 
			{
		System.out.print("Enter first Number: ");
		int fn = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int sn = sc.nextInt();
		System.out.print("Select Symbol to perform (+ , - , * , /) : ");
		String sy = sc.next();
		switch(sy)
			{
			case "+":
				System.out.println(fn +"+"+ sn + "=" + sum(fn,sn));
				break;
			case "-":
				System.out.println(fn +"-"+ sn + "=" + sub(fn,sn));
				break;
			case "*":
				System.out.println(fn +"*"+ sn + "=" + mul(fn,sn));
				break;
			case "/":
				System.out.println(fn +"/"+ sn + "=" + div(fn,sn));
				break;
			default:
				System.out.println("Invalid Operation");
					}//switch
			}//try
			catch(ArithmeticException ae)
			{
				System.out.println("Can't Devide by Zero");
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Input Invalid, please enter number only");
				main(null);
			}
			
			System.out.print("Do it Again? press 1, press any to exit: ");
			ans = sc.next().charAt(0);
		}//do
		
		while(ans=='Y' || ans == 'y');
			
		}//main
	static int sum(int x, int y)
	{
		return x + y;
	}
	static int sub(int x, int y)
	{
		return x-y;
	}
	static int mul(int x, int y)
	{
		return x*y;
	}
	static double div(int x, int y)
	{
		return x/y;
	}
}//class
