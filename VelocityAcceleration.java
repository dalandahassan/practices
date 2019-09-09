import java.util.*;
class Login
{
	public static void main(String [] a)
	{
		double accel = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter v0, v1 and t: ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();
		
		accel = (v1 - v0) / t;
		
		System.out.printf("The average acceleration is %.4f ",accel);
	}//main
}
