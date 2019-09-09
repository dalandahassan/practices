import java.util.*;
class sample
{
	public static void main(String[] Args)
	{

		Scanner sc = new Scanner(System.in);
		int i,j;
		int [] large = new int[5];
		int max = 0,index;
	
		int [] arr = new int [10];
		for(i = 0; i < arr.length; i++)
		{
			System.out.print("Enter Number: ");
			int n = sc.nextInt();
			boolean loop = true;
			do 
			{
				if (checkunique(n,arr))
					{
					arr[i] = n;
					loop = false;
					}
				else
				{
					System.out.print(+n+" is already exist \nEnter Number: ");
					n = sc.nextInt();
				}//else
			}//do
			while(loop);
			}//for
			
			
		
		//for sorting
		System.out.println("Sorted Array");
		for( j=0; j < arr.length; j++)
		{
			Arrays.sort(arr);
			//System.out.print("");
			System.out.print(" "+arr[j]);
		}
		//para maka kuha yung largest number
		for(int y = 0; y < 5; y++)
		{
			max = arr[0];
			index = 0;
			for(int x = 1; x < arr.length; x++)
			{
				if(max < arr[x])
				{
					max = arr[x];
					index = x;
				}
			}
			large[y] = max;
			arr[index] = Integer.MIN_VALUE;
			System.out.print("\nLargest Number: " + large[y]);
		}
		
		//System.out.print("\nThe maximum Value: "+"index["+j+"]"+getMax(arr));

	}//main
	/*
	static int getMax(int[] inputArray)
	{
		int maxVal = inputArray[0];
		for (int i = 1; i < inputArray.length; i++)
		{
			if(inputArray[i]> maxVal)
			{
				maxVal = inputArray[i];
			}
		}
		return maxVal;
	}*/
	//function ito para e check nya ang elements kung already ecxists
	public static boolean checkunique(int testValue, int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if (testValue == array[i])
			{
				return false;
			}
		}
		return true;
	}
}
