import java.util.Scanner;
 class Example
 {
	public static void main(String[]args)
	{
         int a,b,x=0;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Number: ");
			b=scan.nextInt();
			for(a = 1; a < b*2; a+=2)
			{
				System.out.println(a);
				x = x + a;
			}
			System.out.println(x);
			
	}
}