/*create a student with data roll,name,3 marks calculate total and average and display the result */
import java.util.Scanner;
public class Student{
  int rollno;
  String name;
  double mark1,mark2,mark3;
  Scanner s=new Scanner(System.in);
  void getData()
  {
    System.out.println("Enter Name :");
    name=s.nextLine();
    System.out.println("Enter Roll no :");
    rollno=s.nextInt();
    
    System.out.println("Enter Mark1 :");
    mark1=s.nextDouble();
    System.out.println("Enter Mark2 :");
    mark2=s.nextDouble();
    System.out.println("Enter Mark3 :");
    mark3=s.nextDouble();
  }
  double calculate(){
    return (mark1+mark2+mark3);
  }
  double average(){
    return (mark1+mark2+mark3)/3;
  }
  void display(){
    System.out.println("Enter Student Details :");
    System.out.println("\nroll no :" +rollno);
    System.out.println("\nName :" +name);
    System.out.println("\nmark1 :" +mark1);
    System.out.println("\nmark2 :" +mark2);
    System.out.println("\nmark3 :" +mark3);
    System.out.println("\nTotal Marks :" +calculate());
    System.out.println("\nAverage :" +average());
    
  }
  public static void main(String[] args){
    Student s1=new Student();
    s1.getData();
    s1.display();
  }


}


