import java.util.*;
class sample
{
	public static void main(String[] Args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [10];
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter Number: ");
			arr[i] = sc.nextInt();
		}
		for(int j=0; j < arr.length; j++)
		{
			Arrays.sort(arr);
			System.out.print("");
			System.out.print(" "+arr[j]);
		}
	
	}
}