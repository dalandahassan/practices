
import java.util.*;
class NumberToWord
{
	public static void NumberToWord(int n, String s)
	{
		String [] one = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fithteen","Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String [] ten = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Sevety","Eighty","Ninety"};
		if (n>19)
		{
			System.out.print(ten[n/10] + " "+ one[n % 10]);
			//System.out.println();
		}
		else
		{
		System.out.print(one[n]);
		}
		if (n > 0)
		{
			System.out.print(s+" ");
		}
	}
	public static void main(String Args [])
	{
		Scanner sc = new Scanner(System.in);
		//NumberToWord np = new NumberToWord();
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		if (n >= 0 && n <= 999)
		{
			
			NumberToWord((n / 100) % 10, " Hundred");
			NumberToWord(n % 100,"");
		}
		else
		{
		NumberToWord(n,"");
		}
		if(n==0)
		{
			System.out.print("Zero");
		}
		System.out.println();
		main(null);
	}
	
}