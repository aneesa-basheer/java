package Graphics;
import java.util.Scanner;

public class Square implements SquareInterface{
	int s;
	double area,perimeter;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side :");
		s=sc.nextInt();
	}
	public void area(){
		area = s*s;
		System.out.println("Area of square = "+area);
	}
	public void perimeter(){
		perimeter = 4*s;
		System.out.println("Perimeter of square = "+perimeter);
	}
}
