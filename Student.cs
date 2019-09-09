using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

 public class Student
 {
 	private string name;
 	private int age;
 	private double grade;
 	public Student(String name, int age, double grade)
 	 {
  		this.name = name;
  		this.age = age;
  		this.grade = grade;
  	}
   
  public void display()
     {
   	Console.WriteLine("Name:"+name+"\nAge:"+age+"\nGrade:"+grade);
      
  	if(grade<100){
  		Console.WriteLine("Fail");
  		}
  	}
  	
    }
 

class StudentList{
 	

public static void Main (String[]args) 
 {
 	 
 	 Student s1 = new Student("Hassan", 19, 90.5);
 	 s1.display();
     
    
       
   }
   
 }
