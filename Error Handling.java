package sample;
import java.util.*;
class practice
 {
static Scanner sc = new Scanner(System.in);
public static void main(String[] Args){


//int i = sc.nextInt();
double x,y;

//try
/*exception handling  
if user enter dividend zero, this will
 hold the error*/
try {
System.out.print("Enter Dividend: ");
x = sc.nextDouble();
//if(x(null)){
//System.out.print("Enter number");
//sc.nextDouble();
//}
System.out.print("Enter Divisor: ");
y = sc.nextDouble();

double c = x/y;

System.out.println("Result: "+ c);
System.out.println();
} 
catch(ArithmeticException ae){
System.out.println(ae);
}//catch
catch(InputMismatchException ime){
String str;
str = sc.next();
System.out.println("You Entered "+str+" is invalid, Pls enter number only ");
System.out.println();
}
main(null);
}//main

}//class