package Graphics;
import java.util.Scanner;

public class Circle implements CircleInterface{
	int r=0;
	double pi=3.14,area,perimeter;
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius :");
		r=sc.nextInt();
	}
	public void area() {
    area = pi*r*r;
    System.out.println("Area of Circle = "+area);
  }
  public void perimeter() {
    perimeter = 2*pi*r;
    System.out.println("Perimeter of Circle = "+perimeter);
  }
}
