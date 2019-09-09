import java.util.*;
class Login
{
	public static void main(String [] a)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		int sum =0;
		while(number > 0)
		{
			int add = number % 10;
			sum +=add;
			number=number/10;
		}//while
		System.out.println(sum);
	}//main
}