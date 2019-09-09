import java.util.*;
 class Hours{
public static void main(String [] args){
Scanner sk = new Scanner(System.in);
int turns;

System.out.print("Number of Turns: ");
turns=sk.nextInt();
while(turns<0){
turns+=12;
		}
System.out.println("Output: "+turns%12);
	main(null);
	}
}