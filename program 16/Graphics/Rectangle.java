package Graphics;
import java.util.Scanner;

public class Rectangle implements RectangleInterface{
	int l,b;
	double area,perimeter;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length :");
		l=sc.nextInt();
		System.out.println("enter breadth :");
		b=sc.nextInt();
	}
	public void area() {
    area = l*b;
    System.out.println("Area of rectangle = "+area);
  }
  public void perimeter() {
    perimeter =2*( l+b);
    System.out.println("Perimeter of rectangle = "+perimeter);
  }
}
