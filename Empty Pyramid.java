import java.util.*;
class pyramid{

      public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int s;
	      System.out.print("Enter Size: ");
		s = sc.nextInt();
		System.out.print("Size of Pyramid: "+s);
		System.out.println();
		for(int i = 1; i <= s; i++ ){
			for(int k = s -1; k >= i; k--){// loop for pyramid
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				if(j==1||i==j||i==s){//space and empty in middle
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
		main(null);
	}
}