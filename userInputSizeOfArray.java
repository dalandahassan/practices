import java.util.*;
class sample
{
	public static void main(String[] Args)
	{

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter Size of Array: ");
		size = sc.nextInt();
		int [] index = new int[size];
		for(int count = 0; count < size; count++)
		{
			System.out.print("Enter Value of index "+(count+0)+ ": ");
			index[count] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array Value");
		for(int count = 0; count < size; count++)
		{
			System.out.print(" "+index[count]);
		}

	}
}
    