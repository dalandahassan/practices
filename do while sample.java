import java.util.Scanner;
 class Example{
	public static void main(String[]args){
        String name; int answer;
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter your name");
			name= scan.nextLine();
			System.out.println("Hello " + name);
			System.out.println("would you like to change your name? \nEnter 1 for yes and 2 for no");
			answer = scan.nextInt();	
		}while(answer==1);
		
		
		}
	}