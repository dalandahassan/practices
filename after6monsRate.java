import java.util.Scanner;
class Exercise5 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
		final double rate = 0.00417;
		double total =0;
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		total = amount * (1+rate);
		for(int i = 1; i < 6; i++)
		{
			total = (total+amount) * (1+rate);
		}
		System.out.printf("After sixth month, the amount value is $%.2f",total);
    }
}