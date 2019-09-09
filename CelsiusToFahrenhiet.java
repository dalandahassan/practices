import java.util.*;
class Conversion
{
	public static void main(String [] args)
	{
		int sel;
		char choice;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("Select Convertion \n1-Celsius to Fahrenhiet \n2-Fahrenhiet to Celsius \nEnter Number: ");
		sel = sc.nextInt();
		switch(sel)
		{
			case 1:
					System.out.println("----------------------------------");
					System.out.println("Celsius to Fahrenheit");
					System.out.println("----------------------------------");
					System.out.print("Enter Celsius Temperature: ");
					double cel = sc.nextDouble();
					System.out.printf("The Fahrenhiet Temperature is: " +"%.2f%n",Fahrenheit(cel));
					System.out.println("----------------------------------");
				break;
			case 2:
					System.out.println("----------------------------------");
					System.out.println("Fahrenhiet to Celsius");
					System.out.println("----------------------------------");
					System.out.print("Enter Fahrenheit Temperature: ");
					double fah = sc.nextDouble();
					System.out.printf("The Celsius Temperature is: " +"%.2f%n",Celsius(fah));
					System.out.println("----------------------------------");
				break;
				default:
				System.out.println("Please Enter 1 or 2 only");
				System.out.println();
				main(null);
			}//switct

			System.out.print("Again? press Y/N : ");
			choice = sc.next().charAt(0);
		}//do
		while(choice == 'Y' || choice == 'y');
		
	}//main
//converting Fahrenheit to celcius
	static double Celsius(double x)
	{
		double c = (x - 32.0) / 1.8;
		return c;
	}
	static double Fahrenheit(double x)
	{
		double f = (x * 1.8) + 32.0;
		return f;
	}
}//class
