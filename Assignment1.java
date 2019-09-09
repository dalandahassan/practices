/** 
 Assignment number 1
 **/

import java.util.Scanner;
public class Assignment1 
{
    public Assignment1()
    {
        final double POUND = 0.45359237;
        final double INCH = 0.0254;
        double weightPound,heightInches,squareHeigth,BMI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        weightPound = weight * POUND; //converting pound to kg
        heightInches = height * INCH; //converting inch in meter
        squareHeigth = heightInches * heightInches;
        BMI = weightPound / squareHeigth;
        System.out.printf("BMI is %.4f",BMI);
        System.out.println();
    }
    public static void main(String[] hassan) 
    {
       new Assignment1();
    }//main
    
}//class
