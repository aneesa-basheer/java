package Graphics;
import java.util.Scanner;
import java.lang.Math;

public class Triangle implements TriangleInterface{
	int s1,s2,s3;
	double area,perimeter,s;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side 1 :");
		s1=sc.nextInt();
		System.out.println("enter side 2 :");
		s2=sc.nextInt();
		System.out.println("enter side 3 :");
		s3=sc.nextInt();
	}
	public void area(){
		s=(s1+s2+s3)/2.0;
		area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("Area of triangle = "+area);
	}
	public void perimeter(){
		perimeter = s1+s2+s3;
		System.out.println("Perimeter of triangle = "+perimeter);
	}
}
